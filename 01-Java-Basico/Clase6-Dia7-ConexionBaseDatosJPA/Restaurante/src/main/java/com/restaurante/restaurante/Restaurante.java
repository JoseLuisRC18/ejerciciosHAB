
package com.restaurante.restaurante;

import java.util.List;
import logica.Platillo;
import persistencia.ControladoraPersistencia;


public class Restaurante {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        controlPersis.crearPlatillo(new Platillo(1, "Quesadilla", "tortilla y queso", 30));
        controlPersis.crearPlatillo(new Platillo(2, "pizza", "harina ", 250));
        controlPersis.crearPlatillo(new Platillo(3, "hamburguesa", "carne y pan", 100));
        
        List<Platillo>listaPlatillos  = controlPersis.traerPlatillos();
        
        System.out.println("------ANTES------");
        
        for (Platillo plat : listaPlatillos ) {
            System.out.println(plat.toString());
        }
        controlPersis.borrarPlatillo(2);
        
        controlPersis.modificarPlatillo(new Platillo(3, "hamburguesa", "carne y pan", 200));
         
        System.out.println("------DESPUES------");
        
        listaPlatillos  = controlPersis.traerPlatillos();
        
        for (Platillo plat : listaPlatillos ) {
            System.out.println(plat.toString());
        }
    }
}
