package lambdas;

import lambdas.interfaces.IStringRepetido;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        IStringRepetido stringRepetido = (str, veces) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < veces; i++) {
                result.append(str);
            }
            return result.toString();
        };
        
        System.out.println(stringRepetido.repetir("Hola", 3));
        
    }
    
}
