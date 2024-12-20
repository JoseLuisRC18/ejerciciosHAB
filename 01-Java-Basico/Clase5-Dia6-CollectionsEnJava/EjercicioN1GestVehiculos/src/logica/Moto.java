
package logica;

import interfaces.Combustion;


public class Moto extends Vehiculo implements Combustion{
    
    private int cilindrada;
    private String tipoMotor;

    public Moto(int cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    @Override
    public int calcularAntiguedad() {
        int añoActual = 2024; 
        return añoActual - super.anio;
    }

    @Override
    public void recargarCombustible() {
         System.out.println("Recargando combustible de la moto con cilindrada de " + cilindrada + " cc y motor " + tipoMotor + ".");

    }
    
}
