package lambdas;

import lambdas.interfaces.INumeroMenor;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        int numeros[] = {99, 78, 9, 12, 45, 64, 34, 19, 97, 98, 54, 19, 27, 19, 79, 46, 61, 94, 1};

        INumeroMenor numMenor = nums -> {
            int menor = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < menor) {
                    menor = nums[i];
                }
            }
            return menor;
        };
        
        System.out.println("Numero menor es: "+numMenor.encontrarMenor(numeros));
    }

}
