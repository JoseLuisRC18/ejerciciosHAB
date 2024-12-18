
package ejercicion1clasesyobjetos;

import logica.Electrodomestico;

public class EjercicioN1ClasesYObjetos {

   
    public static void main(String[] args) {
        
        //Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        Electrodomestico electro1 = new Electrodomestico(1, "samsumg", "2024", 200, "gris");
        
        Electrodomestico electro2 = new Electrodomestico(2, "PHILIPS", "2024Philips", 300, "blanco");
        
        Electrodomestico electro3 = new Electrodomestico(3, "jvc", "1000", 230, "negro");
    
        // Crear 1 objeto de la clase Electrodomestico sin parámetros
    
        Electrodomestico electroSinParametros = new Electrodomestico();
        
        // Mostrar por pantalla la marca, modelo y consumo energético de los electrodomésticos 
        System.out.println("electrodomestico " + electro1.getMarca() + " modelo " + electro1.getModelo() + "consumo " + electro1.getConsumo() + "kwh");
        System.out.println("electrodomestico " + electro2.getMarca() + " modelo " + electro2.getModelo() + "consumo " + electro2.getConsumo() + "kwh");
        System.out.println("electrodomestico " + electro3.getMarca() + " modelo " + electro3.getModelo() + "consumo " + electro3.getConsumo() + "kwh"); 
        // Intentar obtener la marca del electrodoméstico creado sin parámetros
         
         System.out.println("Marca sin parametros  " + electroSinParametros.getMarca());
         
         //sale null

    
    }
    
}
        



