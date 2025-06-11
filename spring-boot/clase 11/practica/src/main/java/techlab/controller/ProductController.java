package techlab.controller;

import org.springframework.web.bind.annotation.*;
import techlab.entity.Pedido;
import techlab.entity.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/product")
public class ProductController {
    // "BASE DE DATOS" en memoria
    private ArrayList<Producto> productos;

    public ProductController() {
        this.productos = new ArrayList<>();
        agregarProductosDeEjemplo();
    }

    // ENDPOINTS
    @PostMapping("/")
    public String createProduct(@RequestBody Producto producto){
        return agregarProducto(producto);
    }

    @GetMapping("/list")
    public List<Producto> listarProductos(){
        return this.productos;
    }

    // METODOS
    // POST
    public String agregarProducto(Producto producto){
        productos.add(producto);

        return "☣ Producto cargado exitosamente! ☣ \n ID del Producto: " + producto.getId();
    }

    // POST
    private static void agregarPedido(ArrayList<Pedido> pedidos){

        // buscar producto por id, si lo encontramos le pedimos confirmacion
        // preguntamos cuanto quiere agregar de ese producto, comprobamos que hay stock sufiente
        // y lo cargamos al pedido
        // podemos dejar todo en un bucle asi el usuario puede cargar varios productos al pedido
        Pedido nuevoPedido = new Pedido();
//        nuevoPedido.agregarProductoAPedido(new Producto());


        pedidos.add(nuevoPedido);
    }

    // DELETE
    private static void eliminarProducto(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ID del producto a eliminar: ");
        int idAEliminar = entrada.nextInt();
        boolean eliminado = false;
        boolean encontrado = false;
        for (Producto producto : productos){
            if (producto.getId() == idAEliminar){
                encontrado = true;
                System.out.println("El producto que quiere eliminar es el siguiente: ");
                producto.mostrarInfo();
                System.out.println("Confirma la accion?");
                System.out.println("1 - SI");
                System.out.println("2 - NO");
                int opcionEliminar = entrada.nextInt();
                if (opcionEliminar == 1){
                    System.out.println("ELIMINANDO");
                    productos.remove(producto);
                    eliminado = true;
                    break;
                }
            }
        }

        if (!encontrado){
            throw new RuntimeException("No encontramos ningun producto con el id: " + idAEliminar);
        }

        if (eliminado){
            System.out.println("Eliminado con exito");
        }
    }

    // GET
    private static void buscarProducto(ArrayList<Producto> productos) {
        System.out.println("Buscador de productos: ");
        Scanner entrada = new Scanner(System.in);
        String busqueda = entrada.nextLine();
        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto producto : productos){
            if (producto.contieneNombre(busqueda)){
                productosEncontrados.add(producto);
            }
        }

        if (productosEncontrados.isEmpty()){
            System.out.println("No encontramos productos....");
        }else{
            for (Producto producto : productosEncontrados){
                producto.mostrarInfo();
            }
        }
    }

    // GET
    private static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()){
            System.out.println("No hay producto todavia :(");
        }else {
            for (Producto producto : productos){
                producto.mostrarInfo();
            }
        }
    }

    public void agregarProductosDeEjemplo() {
        productos.add(new Producto("Monitor", 1000, 10));
        productos.add(new Producto("Micrófono", 2000, 10));
        productos.add(new Producto("Teclado mecánico", 1500, 15));
        productos.add(new Producto("Mouse gamer", 1200, 20));
        productos.add(new Producto("Laptop", 15000, 5));
        productos.add(new Producto("Tablet", 8000, 7));
        productos.add(new Producto("Disco duro externo", 2500, 12));
        productos.add(new Producto("Memoria USB 64GB", 500, 25));
        productos.add(new Producto("Router Wi-Fi", 1800, 10));
        productos.add(new Producto("Smartphone", 12000, 8));
        productos.add(new Producto("Audífonos Bluetooth", 2200, 18));
        productos.add(new Producto("Cámara Web HD", 1300, 10));
        productos.add(new Producto("Impresora", 4000, 6));
        productos.add(new Producto("Proyector", 9000, 4));
        productos.add(new Producto("Reproductor multimedia", 3000, 9));
        productos.add(new Producto("Smartwatch", 3500, 11));
        productos.add(new Producto("Lector de tarjetas", 800, 14));
        productos.add(new Producto("Estabilizador de voltaje", 1100, 10));
        productos.add(new Producto("Cable HDMI", 300, 30));
        productos.add(new Producto("Panel táctil USB", 2000, 5));
    }
}
