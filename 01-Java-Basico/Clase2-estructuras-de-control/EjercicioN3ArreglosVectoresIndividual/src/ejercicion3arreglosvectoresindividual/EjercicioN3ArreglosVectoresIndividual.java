
package ejercicion3arreglosvectoresindividual;

/**
 *
 * @author luis_
 * Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas 
 * de la última semana, calcule la temperatura máxima promedio que hubo.
 * Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente 
 * temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio
 *  de las mismas recorriendo el vector y mostrando el resultado por pantalla.
 */
import java.util.Scanner;

public class EjercicioN3ArreglosVectoresIndividual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        double semana[]= new double[7];
        double suma = 0;
        double promedio = 0;
        //ingresando datos
         System.out.println("Ingresa las temperaturas tomando en cuenta que el primer dia es Lunes es el dia 1");
         for(int i = 0;i < semana.length; i++ ){
            int dia = i +1;
            System.out.println("Ingresa la temperatura maxima del dia " +  dia );
              semana[i] = teclado.nextInt();
        }
        //imprimiendo datos
        for(int j=0; j < semana.length; j++){
            suma = suma + semana[j];
            System.out.println(" " + semana[j] );
    
     }
        promedio = suma / 7;
        System.out.println("el promedio de temperatura fue  = " + promedio);
    
    }
}
