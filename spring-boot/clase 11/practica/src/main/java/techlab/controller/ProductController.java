package techlab.controller;

import org.springframework.web.bind.annotation.*;
import techlab.entity.Pedido;
import techlab.entity.Producto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    // DTO

    // "BASE DE DATOS" en memoria
    private ArrayList<Producto> productos;

    public ProductController() {
        this.productos = new ArrayList<>();
        agregarProductosDeEjemplo();
    }

    // ENDPOINTS
    @PostMapping("/")
    public String createProduct(@RequestBody Producto producto){
        return this.agregarProducto(producto);
    }

    @GetMapping("/list")
    public List<Producto> obtenerListadoProductos(){
        return this.listarProductos();
    }

    @GetMapping("/find")
    public List<Producto> obtenerProductos(@RequestParam String nombreBusqueda){
        return this.buscarProducto(nombreBusqueda);
    }

    // localhost:8080/product/alksjd -> error
    // localhost:8080/product/12434  -> correcto
    // localhost:8080/product/false  -> error
    // localhost:8080/product/123    -> correcto
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id){
        return this.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Producto editarPrecioProducto(@PathVariable Long id, @RequestParam Double nuevoPrecio){
        return this.editarProducto(id, nuevoPrecio);
    }

    @DeleteMapping("/{id}")
    public Producto borrarProducto(@PathVariable Long id){
        return this.eliminarProducto(id);
    }

    // METODOS
    // POST
    public String agregarProducto(Producto producto){
        productos.add(producto);

        return "☣ Producto cargado exitosamente! ☣ \n ID del Producto: " + producto.getId();
    }

    // GET
    private List<Producto> listarProductos() {
        return this.productos;
    }

    // GET
    private ArrayList<Producto> buscarProducto(String busqueda) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto producto : productos){
            if (producto.contieneNombre(busqueda)){
                productosEncontrados.add(producto);
            }
        }

        return productosEncontrados;
    }

    private Producto buscarPorId(Long id) {
        for (Producto producto : productos){
            if (producto.getId() == id){
                return producto;
            }
        }

        // si llega aca es porque no encontro el producto
        return null;
    }

    private Producto editarProducto(Long id, Double nuevoPrecio){
        Producto producto = this.buscarPorId(id);

        if (producto == null){
            return null;
        }

        producto.setPrecio(nuevoPrecio);

        return producto;
    }

    // DELETE
    private Producto eliminarProducto(Long id) {
        Producto producto = this.buscarPorId(id);

        if (producto == null){
            return null;
        }

        this.productos.remove(producto);

        return producto;
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
