package techlab.clases.c8.abtraccion;

public class ProductoFinal extends Producto implements Descontable, Ejemplo{
    @Override
    public double calcularDescuento() {
        return 0;
    }

    @Override
    public void ejemplo() {

    }
}
