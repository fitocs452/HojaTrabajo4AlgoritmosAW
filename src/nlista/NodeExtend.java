/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase Nodo (Principal)
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class NodeExtend<T> implements Comparable{
    
    /*Valor generico del nodo*/
    protected T _valor;  
    protected NodeExtend<T> _siguiente; 

    
    public NodeExtend<T> getSiguiente() {
        return _siguiente;
    }

    public void setSiguiente(NodeExtend<T> _siguiente) {
        this._siguiente = _siguiente;
    }

    public T getValor() {
        return _valor;
    }

    public void setValor(T _valor) {
        this._valor = _valor;
    }

    @Override
    public boolean equals(Object other){
        
        return this._valor.equals(((Node)other).getValor());
    }
    
    @Override
    public int compareTo(Object other) {
        return (((Comparable)this._valor)).compareTo(other);
        
    }
    
    
}