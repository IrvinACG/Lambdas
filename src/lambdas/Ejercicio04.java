package lambdas;

import lambdas.interfaces.INumeroMayor;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
        int numeros [] = {99,78,9,12,45,64,34,19,97,98,54,19,27,19,79,46,61,94,100};
        INumeroMayor numerosMayor = nums -> {
          int  mayor= nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] > mayor)
                    mayor = nums[i];
            }
          return mayor;
        };
        
        System.out.println("El numero mayor es: "+numerosMayor.encontrarMayor(numeros));
        
    }
    
}
