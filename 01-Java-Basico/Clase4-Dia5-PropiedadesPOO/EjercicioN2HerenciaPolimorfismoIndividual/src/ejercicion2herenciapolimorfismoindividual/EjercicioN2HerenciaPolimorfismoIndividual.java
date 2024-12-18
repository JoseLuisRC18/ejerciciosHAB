
package ejercicion2herenciapolimorfismoindividual;

import logica.Camiseta;
import logica.Pantalon;
import logica.Sombrero;
import logica.Vestimenta;
import logica.Zapato;


public class EjercicioN2HerenciaPolimorfismoIndividual {

    
    public static void main(String[] args) {
        //crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos,
        //3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
        Vestimenta[] vestimentas = new Vestimenta[9];
        
        vestimentas[0] = new Zapato("piel", "corto", 1, "shoe1", 200, "flexi", "26", "negro");
        vestimentas[1] = new Zapato("piel", "chico", 2, "shoe2", 250, "nike", "25", "amarillo");
        vestimentas[2] = new Zapato("hule", "agujeta", 3, "shoe3", 220, "adidas", "30", "azul");
        
        vestimentas[3] = new Pantalon("skini", "mezclilla", 4, "skini1", 500, "levis", "30", "azul");
        vestimentas[4] = new Pantalon("vaquero", "mezclilla gruesa", 5, "vaque", 650, "zara", "34", "marino");
        vestimentas[5] = new Pantalon("slim", "sintetico", 6, "slim mx", 800, "berscha", "32", "negro");

        vestimentas[6] = new Camiseta("corta", "en v", 7, "camisita", 650, "shein", "mediana", "blanca");
        vestimentas[7] = new Camiseta("larga", "redondo", 8, "camison", 1000, "zara", "grande", "beige");
        
        vestimentas[8] = new Sombrero("vaquero", "mediano", 9, "old west", 1250, "frontier", "medinao", "cafe");
    
        for (Vestimenta vestimenta : vestimentas) {
            System.out.println(vestimenta); // 
        }
        for (int i = 0; i < vestimentas.length ; i++){
            vestimentas[i].mostrarMarca();
        }
       

       
    }
    
}
