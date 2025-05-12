package techlab.clases.c7;

public abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(){}

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("metodo normal");
    }

    // cuando definimos un meotodo con abstract queremos que las clases que lo hereden
    // esten obligadas a crearle una logica
    public abstract double calcularTotal();
    public abstract double calcularTotal(String dato);
}
