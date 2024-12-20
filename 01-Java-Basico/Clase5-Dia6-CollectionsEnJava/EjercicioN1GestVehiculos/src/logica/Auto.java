
package logica;

import interfaces.Electrico;


public class Auto extends Vehiculo implements Electrico {
    
    private int capacidadBateria;
    private int autonomia;

    public Auto(int capacidadBateria, int autonomia, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    

    @Override
    public int calcularAntiguedad() {
         int anioActual = 2024; 
        return anioActual - super.anio;
    }

    @Override
    public void cargarEnergia() {
       System.out.println("Cargando energía del auto eléctrico cpacacidad " + capacidadBateria + " mAh.");

    }
    
}
