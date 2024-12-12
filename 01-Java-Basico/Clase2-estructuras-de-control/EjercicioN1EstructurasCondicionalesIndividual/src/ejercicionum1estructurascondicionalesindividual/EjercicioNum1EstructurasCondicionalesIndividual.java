
package ejercicionum1estructurascondicionalesindividual;

/**
 *
 * @author luis_
 *  Una recital permite únicamente el ingreso de mayores de 18 años. 
 *  Para ello necesita un programa que, a partir de que un usuario ingrese su edad, 
 *  determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. 
 *  El programa debe mostrar (según cada caso) un mensaje informando la situación.
 */
import java.util.Scanner;
public class EjercicioNum1EstructurasCondicionalesIndividual {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola Ingresa tu edad ");
         int edad = teclado.nextInt();
         if(edad >= 18){
             System.out.println("Bienvenido puedes Ingresar ");
         }else{
             System.out.println("Lo sentimos no puedes Ingresar ");
         }
    }
    
}
