
package ejercicion2estructurasrepetitivasindividual;

/**
 *
 * @author luis_
 *  Imagina que eres un cajero en un supermercado. Crea un programa en 
 * Java que permita ingresar el precio de varios productos comprados por un cliente.
 * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios 
 * hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
 */
import java.util.Scanner;

public class EjercicioN2EstructurasRepetitivasIndividual {

    
    public static void main(String[] args) {
        System.out.println("**** Hola este Programa te ayudara a sumar el precio total de tu compra ****");
        System.out.println("*** cuando termines ingresar productos ingresa un numero negativo ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio de los productos que comprara ");
        double producto = teclado.nextDouble();
        double suma = 0;
        
        while(producto >= 0){
            suma = suma+ producto;
            System.out.println("Ingrese el precio de los productos que comprara ");
             producto = teclado.nextDouble();
             
            
        }
         System.out.println("terminaste tu compra ");
         System.out.println("la suma de los productos es  " + suma );
        
    }
    
}
