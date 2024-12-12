
package ejercicio3clase3libros;

import java.util.Scanner;
import logica.Libro;

public class Ejercicio3Clase3Libros {

    
    public static void main(String[] args) {
        int vector[] = new int[2];
        Libro lib = new Libro();
        
        System.out.println(" LIBRERIA ");
        for(int i = 0; i < vector.length; i++){
            
         
          Scanner teclado = new Scanner(System.in);
       
            
        System.out.println("Ingresa los datos del libro");
        
        System.out.println("Ingresa el isbn del libro ");
        lib.setIsbn(teclado.nextLine());
        
        System.out.println("Ingresa el titulo del libro");
        lib.setTitulo(teclado.nextLine());
        
        System.out.println("Ingresa el autor del libro");
        lib.setAutor(teclado.nextLine());
        
        System.out.println("Ingresa el genero del libro");
        lib.setGenero(teclado.nextLine());

        
        System.out.println("Ingresa el numero de paginas");
                teclado = new Scanner(System.in);

        lib.setNumpag(teclado.nextInt());
            
        }
        
       
        
        //imprecion
        
        
        
        /*System.out.println("Se modifica el numero de paginas a 200");
        
        lib.setNumpag(200);
        
        System.out.println("ya modificado ");
        */
        
         for(int i = 0; i < vector.length; i++){
             System.out.println(lib.toString());
        }
        
    }
    
}
