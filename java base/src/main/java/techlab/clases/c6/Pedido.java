package techlab.clases.c6;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto p){
        this.productos.add(p);
    }

    public double calcularCostoPedido(){
        double total = 0;
        for (Producto p : this.productos){
            total += p.getPrecio();
        }
        return total;
    }
}
