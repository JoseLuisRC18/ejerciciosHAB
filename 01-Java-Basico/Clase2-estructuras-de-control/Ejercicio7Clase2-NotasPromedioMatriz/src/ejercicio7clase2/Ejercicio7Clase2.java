
package ejercicio7clase2;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class Ejercicio7Clase2 {

    
    public static void main(String[] args) {
       double nota [][] = new double[4][4];
       
        Scanner teclado = new Scanner(System.in);
        

        double promedio = 0;
       
         double suma = 0;

        for(int col = 0 ; col < nota.length; col++){
            suma = 0;
                int alu = col +1;
                System.out.println("Ingresa las notas del alumno : " + alu );
            for(int fil = 0; fil < nota[0].length -1 ; fil++){
                
                nota[col][fil] = teclado.nextDouble();
                suma = suma + nota[col][fil];
            }  
            //promedio
            promedio = (suma / (nota[col].length -1));
            nota[col][nota[0].length -1] = promedio ;
        }
        
        
        System.out.println(" CALIFICACIONES ");
        System.out.println("Alumno Nota 1   \tNota2   \tNota3   \tPromedio");
            for(int col = 0 ; col < nota.length; col++){
                int alu = col +1;
                System.out.println("Alumno:" + alu +"\t");
                
                for(int fil = 0; fil < nota[0].length ; fil++){
                    
                    System.out.print( "\t" + nota[col][fil] + "\t" );
                    
              
                }
                System.out.println();
            }
    }
    
}
