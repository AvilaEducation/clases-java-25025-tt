package techlab.practicas.p6;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();

        Pedido pedido2 = new Pedido();

        Pedido pedido3 = new Pedido();

        agregarProductosAPedido(pedido1);
        agregarProductosAPedido(pedido2);
        agregarProductosAPedido(pedido3);

        double total = pedido1.calcularTotal();

        System.out.println("Lo que debe pagar es: " + total);
    }

    // esto es solo para datos de prueba
    public static void agregarProductosAPedido(Pedido pedido){
        Producto monitor = new Producto("monitor", 2000);
//        monitor.agregarDescuento(20); // 1600
        monitor.setCantidad(10);
        Producto microfono = new Producto("microfono", 4000);
////        microfono.agregarDescuento(10); // 3600
        Producto webcam = new Producto("webcam", 1000);
//        webcam.agregarDescuento(100);

        // agrego los productos al pedido
        pedido.agregarProducto(monitor);
        pedido.agregarProducto(microfono);
        pedido.agregarProducto(webcam);
    }
}
