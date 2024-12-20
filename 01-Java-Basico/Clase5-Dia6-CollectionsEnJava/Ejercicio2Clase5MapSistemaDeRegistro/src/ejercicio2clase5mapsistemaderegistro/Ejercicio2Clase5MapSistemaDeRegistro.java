
package ejercicio2clase5mapsistemaderegistro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ejercicio2Clase5MapSistemaDeRegistro {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        Map<Integer, Double > notas = new HashMap<>();
        System.out.println("Sistema de registro de notas ");
        
        System.out.println("Ingresa el numero de matricula");
        int key = teclado.nextInt();
        notas.put(key, Double.NaN);
        
         System.out.println("Ingresa la calificacion la primera nota ");
        double cali = teclado.nextDouble();
        notas.put(key, cali);
        
        
        
        System.out.println(notas);
        
        
        
       
    }
    
}
