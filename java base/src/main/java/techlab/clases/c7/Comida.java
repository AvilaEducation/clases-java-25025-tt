package techlab.clases.c7;

public class Comida extends Producto {
    int pesoGramos;

    public Comida(String nombre, double precio, int pesoGramos) {
        super(nombre, precio);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Peso del producto: " + this.pesoGramos);
    }

    @Override
    public double calcularTotal() {
        return 0;
    }

    @Override
    public double calcularTotal(String dato) {
        return 0;
    }
}
