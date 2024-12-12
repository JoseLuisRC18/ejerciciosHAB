
package ejercicio4clase2;

/**
 *
 * @author luis_
 */
import java.util.Scanner;
public class Ejercicio4Clase2 {

    
    public static void main(String[] args) {
       /* 
        int cont = 0;
        while(cont <= 10){
            System.out.println("estoy en el numero " + cont);
            //cont = cont + 1;
            cont++;
        }
        */
       Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa numeros positivos");
         int numero = teclado.nextInt();
         int suma = numero;
         while(numero > 0){
             System.out.println("Ingresa numeros positivos");
            
             numero = teclado.nextInt();
              if(numero > 0){
             suma = suma + numero;
             }
         }
         System.out.println("ingresaste un numero negativo ");
         System.out.println("la suma hasta ahora de los numeros ingresados es " + suma );
    }
    
}
