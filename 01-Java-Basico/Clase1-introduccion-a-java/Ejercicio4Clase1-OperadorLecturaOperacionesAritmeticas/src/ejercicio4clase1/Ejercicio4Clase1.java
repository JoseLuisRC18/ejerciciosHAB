
package ejercicio4clase1;

/**
 *
 * @author luis_
 */
import java.util.Scanner;
public class Ejercicio4Clase1 {

   
    public static void main(String[] args) {
        System.out.println("Calculando Operaciones de suma , resta , multiplicacion y division ");
        Scanner scanner = new Scanner(System.in);
        //double PrimerNumero = 10;
        //double SegundoNumero = 4;

        System.out.println("Ingresa el primer numero");
        double PrimerNumero = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double SegundoNumero = scanner.nextDouble();


        double resta = PrimerNumero - SegundoNumero;
        double suma = PrimerNumero + SegundoNumero;
        double multiplicacion = PrimerNumero * SegundoNumero;
        double division = PrimerNumero / SegundoNumero;


        System.out.println("La resta de los dos numeros es: "+ resta);
        System.out.println("La suma de los dos numeros es: "+ suma);
        System.out.println("La multiplicacion de los dos numeros es: "+ multiplicacion);
        System.out.println("La division de los dos numeros es: "+ division);
    }
    
}
