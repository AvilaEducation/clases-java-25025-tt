package techlab.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ESTO SERIA COMO LA BASE DE DATOS DE PRODUCTOS
        ArrayList<Producto> productos = new ArrayList<>();
        agregarProductosDeEjemplo(productos);
        // ESTO SERIA LO QUE EL USUARIO VA COMPRANDO
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        int opcionUsuario = 0;


        do {
               try{
                   System.out.println("""
              Menu principal:
                1) Agregar producto
                2) Listar productos
                3) Buscar/Actualizar producto
                4) Eliminar producto
                5) Crear un pedido
                6) Listar pedidos
                7) Salir
              
              Elija una opción:
              """);
                   opcionUsuario = entrada.nextInt();

                   switch (opcionUsuario){
                       case 1 -> agregarProducto(productos);
                       case 2 -> listarProductos(productos);
                       case 3 -> buscarProducto(productos);
                       case 4 -> eliminarProducto(productos);
                       case 5 -> System.out.println("Crear un pedido...");
                       case 6 -> System.out.println("Listar pedidos...");
                       case 7 -> System.out.println("Gracias por usar la app!");
                       default -> System.out.println("Opcion incorrecta");
                   }
               }catch (RuntimeException e){
                   System.out.println(e.getMessage());
               }
               catch (Exception e){
                   e.printStackTrace();
                   System.out.println("Hubo un error inesperado");
               }
            }while (opcionUsuario != 7);

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

    // POST
    public static void agregarProducto(ArrayList<Producto> productos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu para agregar un producto:");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.printf("Ingrese el precio de %s: ", nombre);
        double precio = entrada.nextDouble();
        System.out.printf("Ingrese el stock de %s: ", nombre);
        int stock = entrada.nextInt();
        Producto producto = new Producto(nombre, precio, stock);

        productos.add(producto);

        System.out.println("☣ Producto cargado exitosamente! ☣");
    }

    public static void agregarProductosDeEjemplo(ArrayList<Producto> productos) {
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
