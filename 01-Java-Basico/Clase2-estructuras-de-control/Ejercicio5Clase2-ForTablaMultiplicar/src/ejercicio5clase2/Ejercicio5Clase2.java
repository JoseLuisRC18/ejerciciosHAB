
package ejercicio5clase2;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class Ejercicio5Clase2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = teclado.nextInt();
        if(numero > 0 && numero <=10){
        int Multi = 0;
            for(int i=0;i <=9 ; i++){
                Multi = numero * i;
                System.out.println("la multiplicacion es " + numero + " X " + i + " = " + Multi );
                
          }
            
        }
        else{
            System.out.println("Ingresaste un numero no valido");
        }
    }
        
    
}
