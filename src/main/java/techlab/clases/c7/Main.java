package techlab.clases.c7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Super Clase
//        Producto producto = new Producto("Producto", 20);
//        producto.mostrarInfo();

        // Sub-Clase
        Producto bebida = new Bebida("Bebida", 20, 100);
        bebida.mostrarInfo();

        // Sub-clase
        Producto comida = new Comida("Comida", 20, 50);
        comida.mostrarInfo();

        ArrayList<Producto> productos = new ArrayList<>();

//        productos.add(producto);
        productos.add(bebida);
        productos.add(comida);

        for (Producto productoFor : productos){
            productoFor.mostrarInfo();
            if (productoFor instanceof Bebida){
                ((Bebida) productoFor).nuevoMetodo();
                Bebida bebida1 = (Bebida) productoFor;
                bebida1.nuevoMetodo();
            }
        }
    }
}
