/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase Pila
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class StackList<T> extends AbstractStack<T> {
    
    private int tam;
    private AbstractList<T> pila;
    
    
    public StackList(int lista, T valor)
    {
        ListFactory listas = new ListFactory();
         pila = listas.getLista(lista, 1);
         for (int i = 0; i < 10; i++)
            pila.agregarValorFinal(valor);
      
        tam = pila.getTamanho()-1;
        System.out.println(pila.toString());
        
    }

    @Override
    
    /*Se obtiene el valor al que va el puntero*/
    public T pop() {
    
        T dato = null;
        if ((this.tam <pila.getTamanho()) && (this.tam > 0))
        {            
            tam++;
            dato = (T)  pila.getPosicion(tam);
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    
    }

    @Override
    
    /*Ingreso de datos a la pila*/
    public void push(T dato){
         
         if ((this.tam < pila.getTamanho()) && (this.tam >0))
        {           
            pila.setPosicion(dato, tam);
            tam--;
        }
        else
            System.out.println("Stack out of bounds");
    
    }

    @Override
    
    /*Se verifica si la pila esta vacia*/
    public boolean isEmpty() {
        return pila.estaVacia();
    }

}
