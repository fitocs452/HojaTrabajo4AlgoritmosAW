/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Fabrica de Listas
 */

package nlista;

/**
 *
 * @author Adolfo
 */
public class ListFactory<T> {
    private AbstractList<T> lista = null;
        public AbstractList<T> getLista(int op1, int op2){

            if(op2 == 1){
                /*Si desea una lista de numeros enteros*/
                if (op1 == 1){
                    lista = (AbstractList<T>) new DoubleList<Integer>();

                if (op1 == 2){
                    lista = (AbstractList<T>) new DoubleList<Integer>();}
                    //post: regresa una lista doblemente
                if (op1 == 3){
                    lista = (AbstractList<T>) new CircularList<Integer>();}
                    //post: regresa una lista circular
                }
                
            /*Si desea una lista de String*/
            else if(op2 == 2){
                if (op1==1){
                    lista = (AbstractList<T>) new List<String>();}
                    //post: regresa una lista enlazada
                if (op1==2){
                    lista = (AbstractList<T>) new DoubleList<String>();}
                    //post: regresa una lista doblemente
                if (op1==3){
                    lista = (AbstractList<T>) new CircularList<String>();}
                    //post: regresa una lista circular

            }

            /*Si desea una lista de Double*/
            else if(op2 == 3){
                if (op1 == 1){
                    lista = (AbstractList<T>) new List<Double>();}
                    //post: regresa una lista enlazada
                if (op1 == 2){
                    lista = (AbstractList<T>) new DoubleList<Double>();}
                    //post: regresa una lista doblemente
                if (op1 == 3){
                    lista = (AbstractList<T>) new CircularList<Double>();}
                    //post: regresa una lista circular
            }

        }
        return lista;
    }
}
