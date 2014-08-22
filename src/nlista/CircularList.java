/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Lista Circular
 */
package nlista;

/**
 *
 * @author Adolfo
 */
public class CircularList<T> extends AbstractList<T>{

    private CircularNode<T> Cola;
    
    private int tamanho;
    NodeFactory Factory = new NodeFactory();
    
    
    /*Crea la lista*/
    public CircularList ()
    {
        Cola = null;
        tamanho = 0;
    }

    @Override
    /*Tamanho de la lista*/
    public int getTamanho() 
    {
        return tamanho;
    }
    
    /*Agrega valores */
    public void Agregar(T valor)
    {
        CircularNode newNode = new CircularNode(valor);
        newNode.setSiguiente(Cola);
        Cola = newNode;
    }   
    
    @Override
    /*Agrega valores al final*/
    public void agregarValorFinal(T valor)
    {
        agregarValorInicial(valor);
        System.out.println(Cola.getValor());
        Cola = (CircularNode<T>) Cola.getSiguiente();
        
    }
    
    @Override
    /*Agrega valores al inicio*/
    public void agregarValorInicial(T valor)
    {
        NodeExtend _newNodo = Factory.getNodo("3", valor,null);
        CircularNode<T> temp = new CircularNode<>(valor);
        if (Cola == null) { // first value added
            Cola = temp;
            Cola.setSiguiente(Cola);
        } else { // element exists in list
            temp.setSiguiente(Cola.getSiguiente());
             Cola.setSiguiente(temp);
        }
        tamanho++;
    }
      
    

    @Override
    /*Se verifica la posicion*/
    public T getPosicion(int pos) 
    {
         if (pos<0||pos>=getTamanho()){
           System.out.println("position out of bounds");
           System.out.println(pos);
           
        }
    
    CircularNode<T> NodoActual = Cola;
    for (int i = 0; i<pos;i++)
    {
     
        NodoActual = (CircularNode<T>) NodoActual.getSiguiente();
    }
        return (T) NodoActual.getValor();
    }

    @Override
    /*Cambia posiciones de algún elemento/nodo */
    public void setPosicion(T valor, int posicion) 
    {
        if (!(0<=posicion||posicion>=getTamanho())){
            System.out.println("Out of bounds");
        }
        CircularNode<T> NodoActual = (CircularNode<T>) Cola.getSiguiente();
        
        for (int i = 0; i<posicion;i++)
        {

            NodoActual = (CircularNode<T>) NodoActual.getSiguiente();
        }
        NodoActual.setValor(valor);
    }

    
    @Override
    /*Modifica el valor de una posicion específica */
     public void agregarValorPosicion (T valor, int posicion)
    {
        if (!(0<=posicion||posicion>=getTamanho())){
            System.out.println("Out of bounds");
        }
        
        if (posicion==getTamanho()-1)
            agregarValorFinal(valor);
        else if (posicion==0){
            agregarValorInicial(valor); tamanho++;
        } 
        else
        {
            
            CircularNode<T> NodoActual = Cola;
            for (int i = 0;i<posicion-1;i++)
            {
                NodoActual = (CircularNode<T>) NodoActual.getSiguiente();
            }
           NodoActual.setSiguiente(new CircularNode(valor, (CircularNode) NodoActual.getSiguiente(),null));
           tamanho++;
        }
        
    }
 
    @Override
    /*Informacion de los nodos*/
    public String toString()
    {
    
        StringBuilder str = new StringBuilder();
        CircularNode<T> curr = (CircularNode<T>) Cola.getSiguiente();
        str.append("[");
        while (true) {
            str.append(curr.getValor());
            str.append(" -> ");
            curr = (CircularNode<T>) curr.getSiguiente();
            if (curr == Cola) break;
        }
        str.append(curr.getValor());
        str.append(" null ");
        str.append("]");
        return str.toString();
    }



    
}