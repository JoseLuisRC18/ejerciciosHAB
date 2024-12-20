
package logica;

public class Nintendo64 extends Consola {
    
    String norma;
    boolean pirata;

    public Nintendo64() {
    }
    
    
    
    public Nintendo64(String codigoConsola, String nombre, String empresaDesarrollo, String anioLanzamiento) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isPirata() {
        return pirata;
    }

    public void setPirata(boolean pirata) {
        this.pirata = pirata;
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
    
    
    
    public void leerCartucho(String juego){
        System.out.println("leyendo cartucho " + juego);
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego. Por favor espere");
    }
    
}
