package techlab.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        agregarProductosDeEjemplo(productos);

        Scanner entrada = new Scanner(System.in);
        int opcionUsuario;

        do {
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
                case 3 -> buscarProucto(productos);
                case 4 -> eliminarProducto(productos);
                case 5 -> System.out.println("Crear un pedido...");
                case 6 -> System.out.println("Listar pedidos...");
                case 7 -> System.out.println("Gracias por usar la app!");
                default -> System.out.println("Opcion incorrecta");
            }
        }while (opcionUsuario != 7);
    }

    private static void eliminarProducto(ArrayList<Producto> productos) {
        System.out.println("Eliminar producto...");
    }

    private static void buscarProucto(ArrayList<Producto> productos) {
        System.out.println("Buscar/Actualizar producto...");
    }

    private static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()){
            System.out.println("No hay producto todavia :(");
        }else {
            for (Producto producto : productos){
                System.out.println("#########################");
                producto.mostrarInfo();
                System.out.println("#########################");
            }
        }
    }

    public static void agregarProducto(ArrayList<Producto> productos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu para agregar un producto:");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.printf("Ingrese el precio de %s", nombre);
        double precio = entrada.nextDouble();
        System.out.printf("Ingrese el stock de %s", nombre);
        int stock = entrada.nextInt();
        Producto producto = new Producto(nombre, precio, stock);

        productos.add(producto);

        System.out.println("☣ Producto cargado exitosamente! ☣");
    }

    public static void agregarProductosDeEjemplo(ArrayList<Producto> productos){
        Producto producto1 = new Producto("monitor", 1000, 10);
        Producto producto2 = new Producto("microfono", 2000, 10);
        productos.add(producto1);
        productos.add(producto2);
    }
}
