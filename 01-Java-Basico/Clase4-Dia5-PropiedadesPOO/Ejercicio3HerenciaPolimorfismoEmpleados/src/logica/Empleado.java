
package logica;


public class Empleado {
    protected String nombre;  
    protected double salarioBase;
    
    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }


    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
    public void calcularSalario(){
        System.out.println("Debe elegir el tipo de empleado para conocer el salario");
        
    }
     public void getDescripcion(){
       System.out.println("El empleado realiza la actividad y trabaja un total de horas");
   }
}
