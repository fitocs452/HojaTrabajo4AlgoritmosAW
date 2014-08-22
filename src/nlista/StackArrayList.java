/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase Arreglo de listas de Pila
 */

package nlista;

/**
 *
 * @author Adolfo
 */
import java.util.ArrayList;

public class StackArrayList<T> extends AbstractStack<T> {

    private int sp;
    private ArrayList<T> pila;
    
    public StackArrayList()
    {           
        pila = new ArrayList(100);
        for (int i = 0; i < 100; i++)
            pila.add(null);        
        sp = pila.size() - 1;
    }
    
    /*Se crea el arraylist*/
    public StackArrayList(int t)
    {
        T valorT = null;
        pila = new ArrayList(t);
        for (int i = 0; i < t; i++)
            pila.add(valorT);        
        sp = 1;
    }
    
    @Override
    /*Método pop para la pila*/
    public T pop() {
        T dato = null;
        if ((this.sp <= pila.size()) && (this.sp > 0))
        {           
            sp--;            
            dato = pila.remove(sp);            
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }

    @Override
    /*Método puch para la pila*/
    public void push(T t) {
        if ((this.sp <= pila.size()) && (this.sp > 0))
        {              
            pila.add(t);
            sp++;
        }
        else
            System.out.println("Stack out of bounds");
    }

    @Override
    /*Verifica si está vacio*/
    public boolean isEmpty() {
        return pila.isEmpty();
    }
    
}