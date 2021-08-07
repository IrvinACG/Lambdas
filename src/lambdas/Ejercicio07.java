package lambdas;

import lambdas.interfaces.INumMayorDeTres;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        INumMayorDeTres numMayorDeTres = (num1,num2,num3) -> {
            if(num1 > num2 && num1 > num3)
                return num1;
            else if(num2 > num1 && num2 > num3)
                return num2;
            else
                return num3;
        };
        int numMayor = numMayorDeTres.encontrar(18, 51, 10);
        System.out.println("Numero mayor es: "+numMayor);
        
    }
    
}
