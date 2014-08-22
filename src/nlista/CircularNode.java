/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase Nodo Circular
 */

package nlista;

/**
 *
 * @author Adolfo
 * @param <T>
 */
public class CircularNode<T> extends NodeExtend {

   //los demás atributos y métodos están en la BaseNodo
    private CircularNode<T> _anterior;

    public CircularNode(T valor, CircularNode<T> _siguiente, CircularNode<T> _anterior)
    {
        this._siguiente = _siguiente;
        this._anterior = _anterior;
        _valor=valor;
    }
    
    public CircularNode(T valor)
    {
        _valor=valor;
    }
    

    public void setSiguiente(CircularNode<T> _siguiente) {
        this._siguiente = _siguiente;
    }

    public CircularNode<T> getAnterior() {
        return _anterior;
    }

    public void setAnterior(CircularNode<T> _anterior) {
        this._anterior = _anterior;
    }
    
    public boolean equals(Object other){
        
        return this._valor.equals(((Node)other).getValor());
    }
    
}
