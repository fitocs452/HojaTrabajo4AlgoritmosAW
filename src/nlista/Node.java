/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase Nodo simple (genérico)
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class Node<T> extends NodeExtend {
   
    
    public Node()
    //post: nodo vacío
    {
        _valor = null;
        _siguiente = null;
    }
    
    public Node(T valor, Node<T> siguiente)
    {
    //pre: se recibe un valor generico y el siguiente nodo a referenciar
    //post: un nuevo elemento es contruido como la cabeza de la lista
        _valor = valor;
        _siguiente = siguiente;
    }
    
    
    public Node(T valor){
        _valor = valor;
        _siguiente = null;
//        
    }
   
    public void setSiguiente(Node<T> _siguiente) {
        this._siguiente = _siguiente;
    }
    
    public boolean equals(Object other){
        
        return this._valor.equals(((Node)other).getValor());
    }
    
}