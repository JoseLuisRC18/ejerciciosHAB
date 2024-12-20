
package logica;


public class XboxOne extends Consola {
    
    boolean conectada;
    boolean calidad4k;
    boolean descargaAutomatica;

    public XboxOne() {
    }
    
    

    public XboxOne(String codigoConsola, String nombre, String empresaDesarrollo, String anioLanzamiento) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
    }

    public boolean isConectada() {
        return conectada;
    }

    public void setConectada(boolean conectada) {
        this.conectada = conectada;
    }

    public boolean isCalidad4k() {
        return calidad4k;
    }

    public void setCalidad4k(boolean calidad4k) {
        this.calidad4k = calidad4k;
    }

    public boolean isDescargaAutomatica() {
        return descargaAutomatica;
    }

    public void setDescargaAutomatica(boolean descargaAutomatica) {
        this.descargaAutomatica = descargaAutomatica;
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
    
    
    
    
    
    public void leerJuegoDigital(String juego){
        System.out.println("leyendo juego digital " + juego);
    }

    @Override
    public void cargarJuego() {
        System.out.println("cargando juego Xbox One espere ....");
    }
            
    
}
