
package ejercicio2herenciavehiculos;
import logica.Vehiculo;
import logica.Auto;
import logica.Moto;



public class Ejercicio2HerenciaVehiculos {


    public static void main(String[] args) {
        
        Auto coche = new Auto(2, "ford", "raptor", 2024);
        Moto moto = new Moto(125, "honda","H125", 2024);
        
        System.out.println("puertas  " + coche.getCantidadPuertas() + "  marca " + coche.getMarca() + "  modelo "+ coche.getModelo() + "  año " + coche.getAnio());
        System.out.println("cilindrada  " + moto.getCilindrada() + "   marca " + moto.getMarca() + "  modelo " + moto.getModelo() + "  año " + moto.getAnio());
        //System.out.println(coche.toString());
       //System.out.println(moto.toString());
        
        moto.acelerar();
        coche.acelerar();
    }
    
}
