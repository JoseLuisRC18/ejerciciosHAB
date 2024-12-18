
package ejerciciointegradorvideojuegos;

import java.util.Scanner;
import logica.VideoJuego;


public class EjercicioIntegradorVideoJuegos {

   
    public static void main(String[] args) {
          VideoJuego game = new VideoJuego();

         VideoJuego vector [] = new VideoJuego[5];
        
         Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Game Store");
        
        for(int i = 0; i < vector.length; i++){
             

            
            System.out.println("Ingresa los datos del Juego" + (i + 1));
            
            teclado = new Scanner(System.in);

            System.out.println("Ingresa el codigo del juego ");           
            game.setCodigo(teclado.nextInt());
            
             System.out.println("Ingresa la cantidad de jugadores"); 
             game.setCantidadJugadores(teclado.nextInt());
             
            teclado = new Scanner(System.in);
             System.out.println("Ingresa el titulo del juego ");                
            game.setTitulo(teclado.nextLine());
            
            System.out.println("Ingresa para que consola es ");
            game.setConsola(teclado.nextLine());
            
            System.out.println("Ingresa a que categoria pertenece");
            game.setCategoria(teclado.nextLine());
            
            
             //guardo libro en vector
            vector[i] = game;
            //reseteo libro y scanner
            game = new VideoJuego();
                teclado = new Scanner(System.in);
            System.out.println("Video Juego cargado correctamente");
            
            
        }
        //datos sin modificar
        
        System.out.println("DATOS ORIGINALES ");
        for(int i = 0; i < vector.length; i++){
            //imprimo el toString modificado para la peticion de solo imprimir titulo consola y cantidad de jugadores
            System.out.println(vector[i].toString2());
        }
        
        System.out.println("Vamos a modificar los titulos y la cantidad de jugadores");
        /*
        for(int i = 0; i < vector.length; i++){
  
            
              System.out.println("Ingresa la cantidad de jugadores del juego"+ (i+1)); 
             game.setCantidadJugadores(teclado.nextInt());
             
            teclado = new Scanner(System.in);
             System.out.println("Ingresa el titulo del juego " + (i+1));                
            game.setTitulo(teclado.nextLine());
            
           
            vector[i] = game;
            //reseteo libro y scanner
            game = new VideoJuego();
                teclado = new Scanner(System.in);
            System.out.println("Datos de Video Juego modificados correctamente");
            
           
        }
           */
        vector[1].setTitulo("cod");
        vector[1].setCantidadJugadores(4);
        
          vector[2].setTitulo("fornite");
        vector[2].setCantidadJugadores(1);
        
        for(int i = 0; i < vector.length; i++){
            //imprimo el toString modificado para la peticion de solo imprimir titulo consola y cantidad de jugadores
            System.out.println(vector[i].toString());
        }
        System.out.println("Video juegos que son para nintendo");
        
        boolean si = false;
        
        for(int i = 0; i < vector.length; i++){
            if("Nintendo 64".equals(vector[i].getConsola())){
                System.out.println(vector[i].toString());
                si = true;
                
            }
            
        }
        if(si != true){ 
                System.out.println("No se encontro");
            }
        
    }
    
}
