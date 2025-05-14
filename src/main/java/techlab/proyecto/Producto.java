package techlab.proyecto;

public class Producto {
    private static int SIGUIENTE_ID = 1;
    private final int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.id = SIGUIENTE_ID;
        SIGUIENTE_ID++;
    }

    // OTROS METODOS
    public void mostrarInfo(){
        System.out.printf("""
                Id: %s
                Nombre: %s
                Precio: %s
                Stock: %s
                """, this.id, this.nombre, this.precio, this.stock);

//        System.out.println("Id: " + this.id);
//        System.out.println("Nombre: " + this.nombre);
//        System.out.println("Precio: " + this.precio);
//        System.out.println("Stock: " + this.stock);
    }

    // GETTERS y SETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
