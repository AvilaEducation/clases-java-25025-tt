package techlab.practicas.p5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> carrito = obtenerProductos();

        calcularTotalProductos(carrito);
        // busqueda de productos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a buscar: ");
        String busqueda = entrada.nextLine();

        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : carrito){
           if (producto.contieneNombre(busqueda)){
               productosEncontrados.add(producto);
           }
        }

        if (productosEncontrados.isEmpty()){
            System.out.printf("No encontramos productos que coincidan con <%s>", busqueda);
        }else {
            System.out.println("PRODUCTOS ENCONTRADOS: ");
            for (Producto producto : productosEncontrados){
                producto.print();
            }
        }
    }

    public static ArrayList<Producto> obtenerProductos(){
        ArrayList<Producto> carrito = new ArrayList<>();

        Producto monitor = new Producto("monitor", 2000);
        monitor.agregarDescuento(20); // 1600
        monitor.agregarCantidad(9);
        Producto microfono = new Producto("microfono", 4000);
        microfono.agregarDescuento(10); // 3600
        Producto webcam = new Producto("webcam", 1000);
        webcam.agregarDescuento(100);

        carrito.add(monitor);
        carrito.add(microfono);
        carrito.add(webcam);

        return carrito;
    }

    public static void calcularTotalProductos(ArrayList<Producto> carrito){
        double costoTotal = 0;
        for (Producto producto : carrito) {
            producto.print();
            costoTotal += producto.calcularPrecioTotal();
        }
        System.out.println("Costo total del carrito: " + costoTotal);
    }
}
