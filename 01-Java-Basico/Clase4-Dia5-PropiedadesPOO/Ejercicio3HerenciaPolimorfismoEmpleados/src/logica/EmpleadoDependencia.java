
package logica;


public class EmpleadoDependencia extends Empleado {
    private double bono;

    public EmpleadoDependencia() {
    }

    public EmpleadoDependencia(double bono, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public EmpleadoDependencia(double bono) {
        this.bono = bono;
    }
    

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
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

    
    
    
    
    @Override
    public void calcularSalario(){
        System.out.println("El salario total es de : $ " +(salarioBase+bono));
        
    }
    public void getDescripcion(){
       System.out.println("El empleado es de Dependencia y por lo tanto recibe un bono de : $ "+bono);
    }
    
    
}
