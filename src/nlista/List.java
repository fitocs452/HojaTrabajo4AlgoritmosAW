/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase Lista con genéricos
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class List<T> extends AbstractList<T>{
    private Node<T> ActualNode;
    private Node<T> Cabeza;
    private int tamaño;
    NodeFactory Factory = new NodeFactory();
       
        
    
    public List(){
    //constructor pone la lista vacía
        Cabeza = null;
        tamaño = 0;
    }

    @Override
    public void agregarValorFinal(T valor){
     //post: agrega un nodo al final de la lista
        
        NodeExtend _newNodo = Factory.getNodo("1", valor,null);
        
        
        if (Cabeza != null){
           
            Node<T> NodoActual = Cabeza;
            while(NodoActual.getSiguiente()!=null){
                NodoActual = (Node<T>) NodoActual.getSiguiente();
            }
            NodoActual.setSiguiente((Node<T>) _newNodo);
        }
        else
            Cabeza = (Node<T>) _newNodo;
        
        tamaño++;
    }
    
    @Override
    public int getTamanho()
    //post: regresa el tamaño de la lista
    {
        int elemento=0;
        Node<T> NodoActual = Cabeza;
        while (NodoActual!=null)
        {
            elemento++;
            NodoActual=(Node<T>) NodoActual.getSiguiente();
        }
        return elemento;
    }
    
    
    @Override
    public void agregarValorInicial(T valor)
    //post: valor es agregado la principio de la lista
    {
        //primero Cabeza es asignado y despues es instanciado
        Cabeza = new Node(valor, Cabeza);
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
            
            Node<T> NodoActual = Cabeza;
            //buscar a la posicion
            for (int i = 0;i<posicion-1;i++)
            {
                NodoActual = (Node<T>) NodoActual.getSiguiente();
            }//cierra for
           //el nodo actual es el nodo anterior
           NodoActual.setSiguiente(new Node(valor, (Node) NodoActual.getSiguiente()));
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
        }
        Node<T> NodoActual = Cabeza;
        
        for (int i = 0; i<posicion;i++)
        {

            NodoActual = (Node<T>) NodoActual.getSiguiente();
        }
        NodoActual.setValor(valor);
    }
    
    @Override
    public T getPosicion(int pos)
    {
       if (pos<0||pos>=getTamanho()){
           System.out.println("position out of bounds");
           System.out.println(pos);
           
        }
    
    Node<T> NodoActual = Cabeza;
    for (int i = 0; i<pos;i++)
    {
     
        NodoActual = (Node<T>) NodoActual.getSiguiente();
    }
    return (T) NodoActual.getValor();
          
     
    }
    
   
 
    @Override
    public String toString(){
       Node Inicio = Cabeza;
       String strLista = "";
       StringBuilder _sb = new    StringBuilder();
       _sb.append("[");
        if (Inicio != null){        
            while (true)
            {
                _sb.append(Inicio.getValor());
                _sb.append("  -> ");            
                
                if (Inicio.getSiguiente()==null)
                    break;
                Inicio = (Node) Inicio.getSiguiente();
            }
        }
                

    _sb.append(" null");
    _sb.append("]");
    return _sb.toString();
    }

    @Override
    public void deleteNodeByValue(T valor) {
        ActualNode = Cabeza;
        NodeExtend<T> punteroSiguiente;
        while(ActualNode.getSiguiente() != null && ActualNode.getSiguiente().equals(valor) != true){
            ActualNode = (Node<T>) ActualNode.getSiguiente();
            punteroSiguiente = ActualNode.getSiguiente();
        }
    }

    
}
