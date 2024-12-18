
package logica;


public class EmpleadoPorHora extends Empleado {
    
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
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
        System.out.println("El salario total es: $ " + (tarifaPorHora*horasTrabajadas)); 
        
    }
    @Override
    public void getDescripcion() {
        System.out.println("Empleado por Hora con tarifa de: $ " + tarifaPorHora + " y horas trabajadas: " + horasTrabajadas);
    }
    
    
}
