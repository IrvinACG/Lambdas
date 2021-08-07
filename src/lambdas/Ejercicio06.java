package lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lambdas.interfaces.INumeroRepetido;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        int numeros[] = {7, 9, 4, 7, 4, 1, 6, 4, 6, 7, 8, 1, 3,3, 9, 1, 5,3, 3, 4, 8, 7, 3, 9, 6, 2, 1, 4, 8, 6, 2, 1, 4, 3, 7, 3, 1, 9, 5, 1, 3, 11};
        INumeroRepetido numRepetido = nums -> {
            int numeroRepetido = 0;
            HashMap<Integer, Integer> numerosUnicos = new HashMap<>();
            //Encontrar numeros unicos
            for (int i = 0; i < nums.length; i++) {
                if (numerosUnicos.get(nums[i]) == null) 
                    numerosUnicos.put(nums[i], 1);
                 else 
                    numerosUnicos.put(nums[i], numerosUnicos.get(nums[i]) + 1);
            }
            //Encontrar mayor
            int auxMayor = 0;
            for(Map.Entry<Integer,Integer> entry : numerosUnicos.entrySet() ){
                if(entry.getValue() > auxMayor ){
                    auxMayor = entry.getValue();
                    numeroRepetido = entry.getKey();
                }
            }
            System.out.println(numerosUnicos);
            return numeroRepetido;
        };

        System.out.println("Numero repetido es: "+ numRepetido.encontrar(numeros));

    }

}
