
package logica;


public abstract class Consola {
    
    protected String codigoConsola;
    protected String nombre;
    protected String empresaDesarrollo;
    protected String anioLanzamiento;

    protected Consola() {
    }

   
    
    // public abstract void cargarJuego();

    protected Consola(String codigoConsola, String nombre, String empresaDesarrollo, String anioLanzamiento) {
        this.codigoConsola = codigoConsola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anioLanzamiento = anioLanzamiento;
    }
    protected abstract void cargarJuego();
}
