package techlab.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProductoAPedido(Producto producto){
        this.productos.add(producto);
    }
}
