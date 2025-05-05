package techlab.clases.c6;

import java.util.ArrayList;

public class BucleFor {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("asd");
        productos.add("asd 1");
        productos.add("asd 2 ");
        productos.add("asd  3");

        for (int i = 0; i < productos.size(); i++) {
            String producto = productos.get(i);

            System.out.println("Producto: " + producto);
        }

        for (String producto : productos) {
            System.out.println("Producto: " + producto);
        }
    }
}
