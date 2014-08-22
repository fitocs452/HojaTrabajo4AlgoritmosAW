/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Main del proyecto
 */

package nlista;

import java.util.Scanner;

/**
 *
 * @author Adolfo
 */
public class NLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  opc = new Scanner(System.in);
        int op1 = 0, op2 = 0;
        AbstractStack pila;
        StackFactory fabPila = new StackFactory();
        
        System.out.println("Elija un tipo de Pila");
        System.out.println("1. ArrayList " + "\n" +
                           "2. Vector " + "\n" +
                           "3. Listas ");
        
        op1 = opc.nextInt();
        
        if (op1 == 3)
        {
            System.out.println("Ingrese el tipo de lista");
            System.out.print("1. Lista\n");
            System.out.print("2. Lista Doble\n");
            System.out.print("3. Lista Circular\n");       
            op2 = opc.nextInt();
        }        
        pila = fabPila.getStack(op1, op2);
        
        System.out.println("Ingrese expresión postFix: ");       
        String exp = opc.next();
        
        double res = 0;
        res = pila.calcular(exp,pila);        
        System.out.println("Resultado: " + res);
    }
    
}
