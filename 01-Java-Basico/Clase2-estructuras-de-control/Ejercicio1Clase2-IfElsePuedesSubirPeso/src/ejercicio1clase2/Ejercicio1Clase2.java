


package ejercicio1clase2;

/**
 *
 * @author luis_
 */

import java.util.Scanner;
public class Ejercicio1Clase2 {

    
    public static void main(String[] args) {
        System.out.println("Hola cual es tu peso?");
            Scanner teclado = new Scanner(System.in);
            double peso = teclado.nextDouble();
             
            if(peso <= 100){
                System.out.println("felicidades puedes subirte");
                
            }else{
                double excede = peso - 100;
                System.out.println("No puedes subirte superas el peso con " + excede + " kilos");
            }
          
    }
    
}
