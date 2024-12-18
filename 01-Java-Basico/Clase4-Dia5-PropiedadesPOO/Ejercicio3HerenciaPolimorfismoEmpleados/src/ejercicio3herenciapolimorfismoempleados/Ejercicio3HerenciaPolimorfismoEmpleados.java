
package ejercicio3herenciapolimorfismoempleados;

import java.util.Scanner;
import logica.Empleado;
import logica.EmpleadoDependencia;
import logica.EmpleadoPorHora;


public class Ejercicio3HerenciaPolimorfismoEmpleados {

    
    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);
             Empleado[] empleados = new Empleado[5]; 
             System.out.println("Bienvenido al sistema de Empleados");
             
            for (int i = 0; i < empleados.length; i++) {
                

            System.out.println("***Elige el tipo de empleado***:");
            System.out.println("1) Empleado trabajando por dependecia \n2) Empleado trabajando por Horas");
               int op = teclado.nextInt();

            teclado = new Scanner(System.in);    

            System.out.println("Ingrese el nombre del empleado:");
            
            String nombre = teclado.nextLine(); 
            
             if (op == 1) {
                
                System.out.println("Ingrese el salario base:");
                double salarioBase = teclado.nextDouble();

                System.out.println("Ingrese el bono:");
                double bono = teclado.nextDouble();


                empleados[i] = new EmpleadoDependencia(bono, nombre, salarioBase);
                

            } 
             else{
                System.out.println("Ingrese las horas trabajadas:");
                int horasTrabajadas = teclado.nextInt();
                
                teclado = new Scanner(System.in);    


                System.out.println("Ingrese la tarifa por hora:");
                double tarifaPorHora = teclado.nextDouble();


                empleados[i] = new EmpleadoPorHora(horasTrabajadas, tarifaPorHora, nombre, tarifaPorHora);
                
                 

            }
            }
            

        System.out.println("\n***** Información de Empleados *****");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            empleado.calcularSalario(); 
            empleado.getDescripcion(); 
            System.out.println();
        }

        teclado.close();
                        

        
    }
    
}
