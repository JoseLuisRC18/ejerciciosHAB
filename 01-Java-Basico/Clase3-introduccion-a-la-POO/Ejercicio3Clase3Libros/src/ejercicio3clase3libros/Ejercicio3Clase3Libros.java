
package ejercicio3clase3libros;

import java.util.Scanner;
import logica.Libro;

public class Ejercicio3Clase3Libros {

    
    public static void main(String[] args) {
         Libro lib = new Libro();
        Libro vector[] = new Libro[5];
       
        
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
          
        //guardo libro en vector
            vector[i] = lib;
            //reseteo libro y scanner
            lib = new Libro();
            
            System.out.println("Libro cargado correctamente");
        }
        
        
       
        
    
        
         for(int i = 0; i < vector.length; i++){
             System.out.println(vector[i].toString());
        }
        
    }
    
}
