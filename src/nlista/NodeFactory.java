/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Fabrica de Nodos
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class NodeFactory<T> {
    /*Declaro los tipos de nodos */
    private Node node;
    private DoubleNode doubleNode;
    private CircularNode circularNode;
    
    public NodeExtend<T> getNodo(String op, T val, DoubleNode<T> Cola){
        /*Verifico el nodo que se desea hacer*/
        if (op == "1"){
            return node = new Node<>(val);
        }else if (op == "2"){
            return doubleNode = new DoubleNode<>(val, null, Cola);
        }else{
            return circularNode = new CircularNode<>(val);
        }
    }
}