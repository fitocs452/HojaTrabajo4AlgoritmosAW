/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Interfaz Pila
 */
package nlista;

/**
 *
 * @author Adolfo
 */
public interface IStack<T> {
    /*Método para ingresar valores a la pila*/
    public T pop();
    /*Método para sacar valores de la pila*/
    public void push(T t);
    /*Método que verifica el estado de la pila*/
    public boolean isEmpty();

}
