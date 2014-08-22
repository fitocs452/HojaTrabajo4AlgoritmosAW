/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Fabrica de Pilas
 */
package nlista;

/**
 *
 * @author Adolfo
 */
public class StackFactory<T> {
    AbstractStack<T> stack = null;
    /*Creación de la pila*/
    public AbstractStack<T> getStack(int op1, int tLista)
    {
        if(op1 == 1){
            stack = new StackArrayList<>();
        } else if (op1 == 2){
            stack = new StackVector<>();
        } else if (op1 == 3){
            stack = new StackList(tLista, 0);
        }
        
        return stack;
    }
}