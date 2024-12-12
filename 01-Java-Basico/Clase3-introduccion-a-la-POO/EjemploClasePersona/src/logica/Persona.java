
package logica;

import java.time.LocalDate;


public class Persona {
    //atributos
    int id_personal;
    String nombre;
    String apellido;
    LocalDate fecha;
    String direccion;       

    public Persona(int id_personal, String nombre, String apellido, LocalDate fecha, String direccion) {
        this.id_personal = id_personal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.direccion = direccion;
    }
    
            
    
            
    
}
