package lambdas;

import lambdas.interfaces.ISaludar;
import lambdas.interfaces.ISuma;

/**
 *
 * @author Irvn Cruz
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //El compilador Infiere el tipo de dato
        //Podemos modificar el nombre de los parametros
        //Siempre que tengamos un solo parametro podemos omitir el uso de parentesis ( )
        //Seimpre que se ejcute una unica sentencia podemos omitir el uso de llaves
        
        ISaludar saludar = usuario -> System.out.println("Hola Mundo!" + usuario);
        saludar.saludar("Irvin");
        
        //Ejemplo de lambda con varias sentencias
        ISaludar saludar2  = usuario -> {
            if(usuario.equals("Irvin"))
                System.out.println("Hola Mundo! "+ usuario);
            else
                System.out.println("Hola Mundo! desconocido");
        };
        saludar2.saludar("Irvinn");
        
        //Podemos evitar la palabra reservada "return" cuando es una unica sentencia
        ISuma suma = (val1, val2) -> val1 + val2;
        
        int resultado = suma.suma(5, 10);
        System.out.println(resultado);
        
        //Ejemplo de return con varias sentencias
        suma = (val1,val2) -> {
            int result = val1 + val2;
            System.out.println("Resultado: "+result);
            return result;
        };
        
        suma.suma(10, 15);
    }
    
}
