
package ejercicio6clase2;

/**
 *
 * @author luis_
 */
import java.util.Scanner;
public class Ejercicio6Clase2 {

    //
    public static void main(String[] args) {
        int vector [] = new int[15];
        int sietes = 0;
        for(int i = 0;i < vector.length; i++ ){
            
            System.out.println("Ingresa un numero ");
              Scanner teclado = new Scanner(System.in);
              vector[i] = teclado.nextInt();
              if(vector[i] == 7){
                   sietes = sietes +1;
        }
        }
        
        //imprimir los numeros
        
        for(int j=0; j < vector.length; j++){
            System.out.println("Indice " + j + " valor : " + vector[j]);
    }
        System.out.println("Se ingreso el numero 7 un total de : " + sietes );
        
    }
    
}
