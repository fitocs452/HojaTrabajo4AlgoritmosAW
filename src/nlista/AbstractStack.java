/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez  Carné: 13014
 William Orozco Carné: 13386

 Guatemala 12 de 08 de 2014
 Descripción:  Clase abstracta Pila
 */

package nlista;

/**
 *
 * @param <T>
 */
public abstract class AbstractStack<T> implements IStack<T> {

    public int calcular(String exp, AbstractStack stack)
    {
           
        /*Se debe verificar todo el arreglo String para clasificar*/
        for (int i = 0; i < exp.length(); i++ )
        {
            /*En caso de que sea un numero se almacena en la pila*/
            switch (exp.charAt(i))
            {
                
                case '0': stack.push(0); break;
                case '1': stack.push(1); break;
                case '2': stack.push(2); break;
                case '3': stack.push(3); break;
                case '4': stack.push(4); break;
                case '5': stack.push(5); break;
                case '6': stack.push(6); break;
                case '7': stack.push(7); break;
                case '8': stack.push(8); break;
                case '9': stack.push(9); break;
                
            }
            
            /*Se verifican las operaciones */
            switch (exp.charAt(i))
            {
                /*Si desea sumar*/
                case '+': 
                {
                    int num1 = (int) stack.pop();
                    int num2 = (int) stack.pop();
                    int resultado = num1 + num2;                                        
                    stack.push(resultado);
                    break;
                }
                
                /*Si desea restar*/
                case '-':                   
                {
                    int num1 = (int) stack.pop();
                    int num2 = (int) stack.pop();                    
                    int resultado = num2 - num1;                                        
                    stack.push(resultado);
                    break;                   
                }
                /*Si desea multiplicar*/
                case '*':
                {
                    int num1 = (int) stack.pop();
                    int num2 = (int) stack.pop();                   
                    int resultado = num1 * num2;                                        
                    stack.push(resultado);
                    break;                    
                }
                /*Si desea dividir*/
                case '/':
                {
                    int num1 = (int) stack.pop();
                    int num2 = (int) stack.pop(); 
                    
                    if(num1 == 0){
                        System.out.println("La division dentro de 0 no está definida");
                    }else{
                        int resultado = num2/num1;
                        stack.push(resultado);
                    }
                    break;                    
                }
            }
        }
        return (int) stack.pop();
    }
    
     
}
