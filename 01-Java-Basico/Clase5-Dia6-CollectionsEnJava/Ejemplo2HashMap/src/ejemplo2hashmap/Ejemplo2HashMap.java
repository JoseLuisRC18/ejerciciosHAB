
package ejemplo2hashmap;

import java.util.HashMap;
import java.util.Map;


public class Ejemplo2HashMap {
   
    public static void main(String[] args) {
      Map<Integer, Double> estaturas = new HashMap<>();
        // System.out.println(estaturas); 
        
         //Agregar valores
        estaturas.put(1, 1.79);
        estaturas.put(2, 1.67);
        estaturas.put(3, 1.58);
        estaturas.put(4, 1.95);
        
        //Búsqueda obtener un dato que se que está
        double estatura = estaturas.get(3);
        
        //Búsqueda por key
        boolean estaONo = estaturas.containsValue("1.54");
        
        
    /*
        PRIMITIVO      CLASE ESPECIAL
        int             Integer
        double          Double
        -               String
    */
        
    }
    
}
