package techlab.practicas.p6;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto : this.productos){
            total += producto.calcularPrecioTotal();
        }

        return total;
    }
}
