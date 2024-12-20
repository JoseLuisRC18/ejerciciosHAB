
package ejercicion1gestvehiculos;

import interfaces.Combustion;
import interfaces.Electrico;
import java.util.ArrayList;
import logica.Auto;
import logica.Camioneta;
import logica.Moto;
import logica.Vehiculo;


public class EjercicioN1GestVehiculos {

    
    public static void main(String[] args) {
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        Auto autoElectrico = new Auto(200, 50, 1, "FFF", "FORD", "FOCUS", 2020, 50000);
        Camioneta camionetaCombustion = new Camioneta(50, 2, 3, "HHH", "SEAT", "LEON", 2024, 100000);
        Moto motoCombustion = new Moto(150, "4 PASOS", 3, "TTTT", "HONDA", "HONDITAA", 2018, 20000);
        
        vehiculos.add(autoElectrico);
        vehiculos.add(camionetaCombustion);
        vehiculos.add(motoCombustion);
        
          for (Vehiculo vehiculo : vehiculos) {
            vehiculo.toString();
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad());
           
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

        }
        
        
        
    }
    
}
