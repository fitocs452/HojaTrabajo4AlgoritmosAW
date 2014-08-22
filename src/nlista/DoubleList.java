/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Listas Doblemente enlazadas
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class DoubleList<T> extends AbstractList<T>{

    private DoubleNode<T> Cabeza;
    private DoubleNode<T> Cola;
    private int tamaño;
    NodeFactory _nFactory = new NodeFactory();
    
    public DoubleList ()
    //post: construye una lista vacia
    {
        Cabeza = null;
        Cola = null;
        tamaño = 0;
    }

    @Override
    public int getTamanho() 
    //post: regresa un entero con el tamaño de la lista
    {
        return tamaño;
    }
    
    
    @Override
    public void agregarValorFinal(T valor)
    //pre: el valor es no nulo
    //post: añade un elemento al final de la lista
    {
        NodeExtend _newNodo = _nFactory.getNodo("2", valor,Cola);
         
        Cola = (DoubleNode<T>) _nFactory.getNodo("2",valor,Cola);
        if (Cabeza != null){
           
            DoubleNode<T> NodoActual = Cabeza;
            while(NodoActual.getSiguiente()!=null){
                NodoActual = (DoubleNode<T>) NodoActual.getSiguiente();
            }
            NodoActual.setSiguiente((DoubleNode<T>) _newNodo);
        }
        else
            Cabeza = (DoubleNode<T>) _newNodo;
        
        tamaño++;
     }
    @Override
    public void agregarValorInicial(T valor)
    //pre: recibe un valor no nulo
    //post: añade un valor al prinicipio de la lista
    {
        Cabeza = new DoubleNode<> (valor, Cabeza, null);
        if (Cola==Cabeza)
            Cola=Cabeza;
        tamaño++;
    }
 
  
  
    @Override
    public void agregarValorPosicion (T valor, int posicion)
     //pre: la posicion esta dentro el rango de la lista creada
     //post: añade valor en la posicion de la lista
    {
        if (!(0<=posicion||posicion>=getTamanho())){
            System.out.println("Out of bounds");
        }
        
        if (posicion==getTamanho()-1)
            agregarValorFinal(valor);
        else if (posicion==0){
            agregarValorInicial(valor); tamaño++;
        } 
        else
        {
            
            DoubleNode<T> NodoActual = Cabeza;
            //buscar a la posicion
            for (int i = 0;i<posicion-1;i++)
            {
                NodoActual = (DoubleNode<T>) NodoActual.getSiguiente();
            }
           //el nodo actual es el nodo anterior
           NodoActual.setSiguiente(new DoubleNode(valor, (DoubleNode) NodoActual.getSiguiente(),NodoActual.getAnterior()));
           tamaño++;
        }//cierra else
        
    }
    
    @Override
    public void setPosicion(T valor, int posicion)
    //pre: no esta vacia
    //post: intercambia un valor dentro la lista
    {
        if (!(0<=posicion||posicion>=getTamanho())){
            System.out.println("Out of bounds");
        }//cierra if
        DoubleNode<T> NodoActual = Cabeza;
        
        for (int i = 0; i<posicion;i++)
        {

            NodoActual = (DoubleNode<T>) NodoActual.getSiguiente();
        }//cierra for
        NodoActual.setValor(valor);
    }
   
    @Override
    public T getPosicion(int pos)
    //pre: recibe entero con la posicion del valor
    //post: regresa el valor en la posicion ingresada
    {
       if (pos<0||pos>=getTamanho()){
           System.out.println("position out of bounds");
           System.out.println(pos);
           
    }
    
    DoubleNode<T> NodoActual = Cabeza;
    for (int i = 0; i<pos;i++)
    {
     
        NodoActual = (DoubleNode<T>) NodoActual.getSiguiente();
    }//cierra for
    return (T) NodoActual.getValor();
    }
    
 
    
    @Override
    public String toString(){
       DoubleNode<T> Inicio = Cabeza;
       String strLista = "";
       StringBuilder _sb = new    StringBuilder();
   
        if (Inicio != null){        
            while (true)
            {
                _sb.append(Inicio.getValor());
                _sb.append("  -> ");            
                
                if (Inicio.getSiguiente()==null)
                    break;
                Inicio = (DoubleNode<T>) Inicio.getSiguiente();
            }
        }
                

    return _sb.toString();
    }

}
