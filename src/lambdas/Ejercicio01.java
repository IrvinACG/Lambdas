package lambdas; 

import lambdas.interfaces.IPromedio;

/**
 *
 * @author Irvn Cruz
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
        int califiaciones[] = {7,8,10,9,8,4,8,6,9,9};
        
        IPromedio promedio = calificaciones -> {
            double resultado = 0;
            for(int n : calificaciones){
                resultado = (double) n + resultado;
            }
            return resultado / califiaciones.length;
        };
        
        System.out.println("Premdio de Calificaciones: " + promedio.calcular(califiaciones));
        
    }
    
}
