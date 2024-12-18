
package ejercicion2pooindividual;

import logica.Persona;


public class EjercicioN2POOIndividual {

    
    public static void main(String[] args) {
        
        // Crear un vector de tipo Persona con cinco posiciones

        Persona[] personas = new Persona[5];
        
        //Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        
        
         personas[0] = new Persona(1, "luis", 26, "independencia 1", "551011000");
         personas[1] = new Persona(2, "jose", 26, "mexico 100", "558851012");
         personas[2] = new Persona(3, "juan", 30, "cdmx 20", "55307468");
         personas[3] = new Persona(4, "maria", 20, "michoacan 40", "5641806423");
         personas[4] = new Persona(5, "sofia", 24, "sonora 600", "5671806727");
         
         System.out.println("Impresion");
         
         for(int i=0;i<personas.length;i++){
                 Persona persona = personas[i];

                        System.out.println("Nombre: " + persona.getNombre() + "   Edad: " + persona.getEdad());

         }
         

            //Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y
            //luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
         System.out.println("datos a cambiar nombres de dos personas  ANTES...");
         System.out.println("nombre " + personas[1].getNombre() + "  Edad " + personas[1].getEdad());
         System.out.println("nombre " + personas[4].getNombre() + "  Edad " + personas[4].getEdad());
         
         //cambiando 
         
         personas[1].setNombre("mario");
         personas[4].setNombre("lucia");
         
          System.out.println("Nombres ya cambiados   ...");
         System.out.println("nombre " + personas[1].getNombre() + "  Edad " + personas[1].getEdad());
         System.out.println("nombre " + personas[4].getNombre() + "  Edad " + personas[4].getEdad());
         
         for(int i=0;i<personas.length;i++){                
             Persona persona = personas[i];

             if(persona.getEdad() >= 30){
                 System.out.println("Personas con edad mayor a 30 ");
                   System.out.println("Nombre: " + persona.getNombre() + "   Edad: " + persona.getEdad());
                 
                 
             }
                       

         }
        
    }
    
}
