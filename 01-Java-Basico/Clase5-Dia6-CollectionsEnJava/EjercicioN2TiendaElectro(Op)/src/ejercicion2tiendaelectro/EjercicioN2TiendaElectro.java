
package ejercicion2tiendaelectro;

import java.util.ArrayList;
import logica.Producto;


public class EjercicioN2TiendaElectro {

   
    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto(1, "bocina", "jvc", "bluethoo", 200, 250, 10));
        productos.add(new Producto(2, "radio", "sony", "frecuencia", 1000, 1200, 2));
        productos.add(new Producto(3, "consola", "nintendo", "juegos", 3000, 3500, 5));
        productos.add(new Producto(4, "estereo", "piooner", "modular", 2500, 2800, 2));
        productos.add(new Producto(5, "dvd", "clio", "reproductor", 600, 700, 4));
        productos.add(new Producto(6, "tv", "tvc", "televisor", 6000, 7500, 10));
        productos.add(new Producto(7, "laptop", "lenovo", "portatil", 8000, 9200, 7));
        productos.add(new Producto(8, "impresora", "hp", "multifuncional", 4000, 4500, 15));
        productos.add(new Producto(9, "monitor", "samsumg", "led", 7500, 8200, 9));
        productos.add(new Producto(10, "repetidor", "huawei", "red", 450, 500, 12));
        
         for (Producto producto : productos) {
                System.out.println(producto.toString());
            }
        
        double maxPrecioVenta = Double.MIN_VALUE;
        Producto productoMaxPrecioVenta = null;

        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > maxPrecioVenta) {
                maxPrecioVenta = producto.getPrecioVenta();
                productoMaxPrecioVenta = producto;
            }
        }
        System.out.println("El producto del precio mayor es : " + productoMaxPrecioVenta.getNombre());

       
        double minPrecioCosto = Double.MAX_VALUE;
        Producto productoMinPrecioCosto = null;

        for (Producto producto : productos) {
            if (producto.getPrecioCosto() < minPrecioCosto) {
                minPrecioCosto = producto.getPrecioCosto();
                productoMinPrecioCosto = producto;
            }
        }
        System.out.println("\nEl producto con el menor precio de costo es: " + productoMinPrecioCosto.getNombre());

        if (productos.size() > 5) {
            Producto productoEliminado = productos.remove(5);
            System.out.println("Se ha eliminado el producto en la posición 5: " + productoEliminado.getNombre() + " " + productoEliminado.getMarca());
        } else {
            System.out.println("No hay suficientes productos en la lista para eliminar en la posición 5.");
        }

        int maxStock = Integer.MIN_VALUE;
        Producto productoMaxStock = null;

        for (Producto producto : productos) {
            if (producto.getCantidadStock() > maxStock) {
                maxStock = producto.getCantidadStock();
                productoMaxStock = producto;
            }
        }

        if (productoMaxStock != null) {
            productoMaxStock.setCantidadStock(productoMaxStock.getCantidadStock() - 3);
            System.out.println("\nEl producto con la mayor cantidad en stock es: " + productoMaxStock.getNombre());
            System.out.println("Se han descontado 3 unidades del stock.");
        } else {
            System.out.println("No hay productos en el inventario.");
        } 
        
        
    }
    public static void ciclo(){
        
           
            
        }
    
}
