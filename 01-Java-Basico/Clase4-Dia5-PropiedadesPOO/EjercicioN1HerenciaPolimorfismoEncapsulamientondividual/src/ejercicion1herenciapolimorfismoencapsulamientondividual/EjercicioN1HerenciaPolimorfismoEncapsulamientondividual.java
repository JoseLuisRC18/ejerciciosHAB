


package ejercicion1herenciapolimorfismoencapsulamientondividual;

import logica.Animal;
import logica.Ave;
import logica.Mamífero;
import logica.Reptil;


public class EjercicioN1HerenciaPolimorfismoEncapsulamientondividual {

    
    public static void main(String[] args) {
        
        
        
        Mamífero mamifero = new Mamífero(4, "sexual", "negro", "bosque", 1, "bear", 5, "peluda", "ovnivora");
        Ave ave = new Ave("medianas", "agitado", "blanco", "grande", 2, "gaviota", 2, "plumaje", "vegetariana");
        Reptil reptil = new Reptil(1.50, "grandes", "no mortal", "selva", 3, "serpiente", 1, "escamosa", "ovnivora");
    
        System.out.println("nombre " + mamifero.getNombre() + "habitad" + mamifero.getHabitad() + "patas" + mamifero.getPatas());
        System.out.println("nombre " + ave.getNombre() + " color plumaje " + ave.getColorPlumaje() + "evergadura de alas " + ave.getEnvergaduraAlas());
        System.out.println("nombre " + reptil.getNombre() + " escamas " + reptil.getTipoEscamas() + "longitud " + reptil.getLongitud());
        ave.saludar();
        reptil.saludar();
        mamifero.saludar();
        
        //d) Crear un objeto de tipo animal e intentar asignarle al Mamífero creado… 
         //   ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto? no se puede
        
        //) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar
        //acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto? MARCA ERROR 
        
        
    }   
    
}
