/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Vector de PIla
 */
package nlista;

import java.util.Vector;

/**
 *
 * @author Adolfo
 */
public class StackVector<T> extends AbstractStack<T> {
    
    private int tam;
    private Vector pila;
    
    public StackVector()
    {
        pila = new Vector();
        pila.setSize(10);
        tam = pila.size()-1;
    }

    /*método polimófico para crear un vector con N tamanho*/
    public StackVector(int _tam)
    {
        pila = new Vector(_tam);               
        tam =  pila .size()-1;
    }
    @Override
    /*Toma los datos de la pila mediante un puntero*/
    public T pop() 
    {
        T dato = null;
        if ((this.tam <  pila .size()) && (this.tam > 0))
        {            
            tam++;
            dato = (T)  pila .get(tam);
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }

    @Override
    /*Ingreso de los datos a la pila*/
    public void push(T dato) 
    {
        
         if ((this.tam <  pila.size() ) && (this.tam >0))
        {           
            pila .set(tam, dato);           
            tam--;
        }
        else
            System.out.println("Stack out of bounds");
    
    }

    @Override
    /*Verifica si la lista esta vacia*/
    public boolean isEmpty() 
    {
        return  pila.isEmpty();
    }

}