/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase abstracta Lista
 */

  

package nlista;

/**
 *
 * @author Adolfo
 */
public abstract class AbstractList<T> implements IList<T>{
      

    /*Verifica si la lista esta vacia*/
    @Override
    public boolean estaVacia()
    {
        if(getTamanho()==0){
            return true;
        }else{
            return false;
        }
    }
    
    
    public void deleteNodeByValue(T valor){}
  
}