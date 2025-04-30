package techlab.clases.c5;

public class Main {
    public static void main(String[] args) {
        Producto teclado = new Producto("teclado", -200);

        teclado.descontarStock();

        double precio = teclado.precioConDescuento();
        System.out.println("precio final: " + precio);

        teclado.reporteProducto();

        Producto mouse = new Producto();

        mouse.reporteProducto();

        Cliente cliente1 = new Cliente("Marco", "marco@gmail.com");
        cliente1.mostrarDatos();

        Cliente cliente2 = new Cliente("Amy", "amy@gmail.com");
        cliente2.mostrarDatos();

    }
}
