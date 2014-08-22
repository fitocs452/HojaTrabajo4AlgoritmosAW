package nlista;

/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Nodos dobles
 */

/**
 *
 * @author Adolfo
 */
public class DoubleNode<T> extends NodeExtend{

    
    private DoubleNode<T> _anterior;
    
    public DoubleNode()
    //post: crea un nodo vacío
    {
        _valor=null;
        _siguiente=null;
        _anterior=null;
    }
    
    /*Nodo simple*/
    public DoubleNode(T valor)
    {
        _valor=valor;
        _siguiente = null;
        _anterior = null;
    }
    
    /*Nodo doble (cabeza y cola)*/
    public DoubleNode (T valor, DoubleNode<T> siguiente, DoubleNode<T> anterior)
    {
      _valor = valor;
      _siguiente = siguiente;
      _anterior=anterior;
     
    }
    
    @Override
    public int compareTo(Object other) {
        return (((Comparable)this._valor)).compareTo(other);
        
    }

    public DoubleNode<T> getAnterior() {
        return _anterior;
    }

    public void setAnterior(DoubleNode<T> _anterior) {
        this._anterior = _anterior;
    }
    
    public void setSiguiente(DoubleNode<T> _siguiente) {
        this._siguiente = _siguiente;
    }
    
    public boolean equals(Object other){
        
        return this._valor.equals(((Node)other).getValor());
    }
    
}