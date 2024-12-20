
package ejercicio3clasesabstractas;

import logica.Nintendo64;
import logica.PlayStation2;
import logica.XboxOne;


public class  Ejercicio3ClasesAbstractas {

    
    public static void main(String[] args) {
        
        Nintendo64 nintendo = new Nintendo64();
        PlayStation2 ps2 = new PlayStation2(); 
        XboxOne xbox = new XboxOne();
        
        nintendo.cargarJuego();
        nintendo.leerCartucho("Banjo Kazooie");
        
        ps2.cargarJuego();
        ps2.leerDVD("Leyendo DVD Fifa 2009");
        ps2.grabarEnMemory();
        xbox.cargarJuego();
        xbox.leerJuegoDigital("HALO");
    }
    
}
