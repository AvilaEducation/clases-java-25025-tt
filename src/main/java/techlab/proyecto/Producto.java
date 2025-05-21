package techlab.proyecto;

public class Producto {
    private static int SIGUIENTE_ID = 1;
    private final int id;
    private String nombre;
    private double precio;
    private int stock;
    private int cantidadAComprar;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cantidadAComprar = 0;
        this.id = SIGUIENTE_ID;
        SIGUIENTE_ID++;
    }

    // OTROS METODOS
    public void mostrarInfo(){
        System.out.println("#########################");
        System.out.printf("""
                Id: %s
                Nombre: %s
                Precio: %s
                Stock: %s
                """, this.id, this.nombre, this.precio, this.stock);
        System.out.println("#########################");

//        System.out.println("Id: " + this.id);
//        System.out.println("Nombre: " + this.nombre);
//        System.out.println("Precio: " + this.precio);
//        System.out.println("Stock: " + this.stock);
    }

    public boolean contieneNombre(String busqueda){
        String nombreMinuscula = this.nombre.toLowerCase();
        // TODO: agregar una forma de reemplazar todas las vocales con acento por las vocales sin acento
        // a checkear: https://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html
        // a checkear: nombreMinuscula.replaceAll("á", "a");
        return nombreMinuscula.contains(busqueda.toLowerCase());
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
