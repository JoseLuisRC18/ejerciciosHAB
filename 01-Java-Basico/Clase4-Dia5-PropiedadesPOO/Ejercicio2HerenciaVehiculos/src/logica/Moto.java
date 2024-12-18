
package logica;

public class Moto extends Vehiculo {
    
    private double cilindrada;

    public Moto() {
    }

    public Moto(double cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getAnio() {
        return anio;
    }

    @Override
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
   public void acelerar(){
       System.out.println("La moto está acelerando");
   }

    @Override
    public String toString() {
        return "Moto{" + "cilindrada=" + cilindrada + '}';
    }

    
    
    
    
}
