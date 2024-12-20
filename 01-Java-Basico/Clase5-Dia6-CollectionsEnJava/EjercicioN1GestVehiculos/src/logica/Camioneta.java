
package logica;

import interfaces.Combustion;


public class Camioneta extends Vehiculo implements Combustion {
    
    
    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int capacidadTanque, double consumoCombustible, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
    
    

    @Override
    public int calcularAntiguedad() {
        int añoActual = 2024; // 
        return añoActual - super.anio ;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta con capacidad de tanque de " + capacidadTanque + " litros.");

    }
    
    
}
