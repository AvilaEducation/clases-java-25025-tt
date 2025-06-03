package techlab.clases.c6;

public class Main {
    public static void main(String[] args) {
        Producto productoGenerico = new Producto();
        System.out.println(productoGenerico.getNombre());
        productoGenerico.setNombre("                   ");
        System.out.println(productoGenerico.getNombre());

        Producto productoGenerico1 = new Producto();

        Producto productoGenerico2 = new Producto();

        Producto productoGenerico3 = new Producto();

        System.out.println(productoGenerico1.id);
        System.out.println(productoGenerico2.id);
        System.out.println(productoGenerico3.id);
    }
}
