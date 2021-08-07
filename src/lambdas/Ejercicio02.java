package lambdas;

import lambdas.interfaces.IFactorial;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        IFactorial factorial = numero -> {
         int result = 1;
            for (int i = 1; i <= numero; i++) {
                result = result * i;
            }
         return result;
        };
        
        int numero = 4;
        
        System.out.println("Factorial de : "+numero+" es: "+factorial.calcular(numero));
    }
}
