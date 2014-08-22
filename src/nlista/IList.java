/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Interfaz Lista
 */
package nlista;

/**
 *
 * @author Adolfo
 */
public interface IList<T> {
    
    
    public int getTamanho();
   // post: regresa el tamaño de la lista
   
   public void agregarValorInicial(T value);
   // post: agrega un valor al principio de la lista

   public void agregarValorFinal(T value);
   // post: agrega un valor al final de la lista

   public boolean estaVacia();
   // post: regresa true si la lista esta vacía
   
    @Override
   public String toString();
   //post: muestra la lista
   
   public T getPosicion(int pos);
   //post: devuelve un valor en la posicion
   
   public void setPosicion(T valor, int pos);
   //post: pone un valor en la posicion
   
   public void agregarValorPosicion(T valor, int posicionValor);
   //post: agregar un valor en determinada posicion
   
   
}