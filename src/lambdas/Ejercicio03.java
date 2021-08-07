package lambdas;

import lambdas.interfaces.INumeroPar;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
                                                    //IF con operador ternario ?
        INumeroPar numPar = n -> (n%2==0) ? true : false;
        
        int numero = 100;
        System.out.println("Numero "+numero+" es par: "+numPar.esPar(numero));
    }
    
}
