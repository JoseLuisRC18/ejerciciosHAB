
package logica;

public class PlayStation2 extends Consola {
    String norma;
    boolean chipeado;
    double tamanioMemory;

    public PlayStation2() {
    }

    
    public PlayStation2(String codigoConsola, String nombre, String empresaDesarrollo, String anioLanzamiento) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipeado() {
        return chipeado;
    }

    public void setChipeado(boolean chipeado) {
        this.chipeado = chipeado;
    }

    public double getTamanioMemory() {
        return tamanioMemory;
    }

    public void setTamanioMemory(double tamanioMemory) {
        this.tamanioMemory = tamanioMemory;
    }

    public String getCodigoConsola() {
        return codigoConsola;
    }

    public void setCodigoConsola(String codigoConsola) {
        this.codigoConsola = codigoConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public String getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(String anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    
    
    
    public void leerDVD(String juego){
        System.out.println("leyendo dvd " + juego);
    }
    
    public void grabarEnMemory(){
        System.out.println("se guardo correctamente " );
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego en play station 2. Por favor espere ");
    }
    
}
