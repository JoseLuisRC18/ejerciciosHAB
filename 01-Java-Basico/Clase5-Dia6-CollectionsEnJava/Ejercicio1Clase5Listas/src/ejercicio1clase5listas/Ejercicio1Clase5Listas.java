
package ejercicio1clase5listas;

import java.util.Scanner;
import java.util.ArrayList;
import logica.Productos;

public class Ejercicio1Clase5Listas {

   
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         
         ArrayList<Productos> productolist = new ArrayList<>();
         
        int op;
        
        do{
            
         System.out.println("****MENU PRINCIPAL****");
         System.out.println(" 1) ALTA \n 2) BAJA \n 3) CONSULTA \n 4) MODIFICACIONES \n 5) SALIR");
         System.out.println("Ingresa el numero de acuerdo a la opcion que necesites");
         op = teclado.nextInt();
         
         
         switch(op){
            case 1:
                System.out.println("****ALTA**** ");
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el nombre del producto:");
                String nombre = teclado.nextLine();
                System.out.println("Ingrese la marca del producto:");
                String marca = teclado.nextLine();
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el precio del producto:");
                double precio = teclado.nextDouble();

                productolist.add(new Productos(nombre, marca, precio));
                System.out.println(" *** se agrego producto correctamente *** ");

                teclado.nextLine();
            break;
            case 2:
                System.out.println("****BAJA**** ");
                System.out.println("Ingrese el nombre del producto que desea eliminar:");
                teclado = new Scanner(System.in);
                String nombreEliminar = teclado.nextLine();
                boolean eliminado = false;
                for (int i = 0; i < productolist.size(); i++) {
                    if (productolist.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                        productolist.remove(i);
                        eliminado = true;
                        System.out.println(" *** Producto eliminado correctamente ***");
                        break;
                    }
                }
                if (!eliminado) {
                    System.out.println("Producto no encontrado.");
                }
                teclado.nextLine();
            break;
            
            case 3:
                System.out.println("****CONSULTA**** ");

                if (productolist.isEmpty()) {
                    System.out.println("** No existen productos en la lista **");
                } else {
                    System.out.println("Productos:");
                    for (Productos producto : productolist) {
                        System.out.println("Nombre Producto : " + producto.getNombre() + " -- Marca : " + producto.getMarca() + " -- Precio: " + producto.getPrecio());
                    }
                }
                teclado.nextLine();
            break;
            
            case 4:
                System.out.println("****MODIFICACIONES**** ");
                System.out.println("Ingrese el nombre del producto que desea modificar:");
                teclado = new Scanner(System.in);
                String nombreModificar = teclado.nextLine();
                boolean encontrado = false;

                for (Productos producto : productolist) {
                    if (producto.getNombre().equalsIgnoreCase(nombreModificar)) {
                        System.out.println("Producto encontrado Ingresa Producto registrado:");
                        System.out.println("Nuevo nombre \n Si no quieres cambiar solo da enter");
                        String nuevoNombre = teclado.nextLine();
                        if (!nuevoNombre.isEmpty()) {
                            producto.setNombre(nuevoNombre);
                        }
                        System.out.println("Nueva marca \n Si no quieres cambiar solo da enter");
                        String nuevaMarca = teclado.nextLine();
                        if (!nuevaMarca.isEmpty()) {
                            producto.setMarca(nuevaMarca);
                        }
                        System.out.println("Nuevo precio \n Si no quieres cambiar solo da enter");
                        double nuevoPrecio = teclado.nextDouble();
                        teclado.nextLine();
                        if (nuevoPrecio >= 0) {
                            producto.setPrecio(nuevoPrecio);
                        }
                        System.out.println(" *** Producto  ha sido modificado correctamente *** ");

                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
                teclado.nextLine();
            break;
            
            case 5:
                System.out.println("****SALIO**** ");
            break;
            
            default:
                System.out.println("el numero no es valido");
            break;
         
        
    }
        }while(op != 5);
       
    }

    
}
