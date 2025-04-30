package techlab.practicas.p5;

public class Producto {
    // descripcion (atributos)
    String nombre;
    double precio;
    int stock;
    int cantidad;
    double descuento; // descuento es un numero entre 0 y 100

    // constructores
    public Producto(){}

    public Producto(String nombreProducto, double precio){
        this.nombre = nombreProducto;
        this.precio = precio;
        this.stock = 20;
        this.cantidad = 1;
        this.descuento = 0;
    }

    void print(){
        System.out.println("******************************");
        System.out.println("* Nombre: " + this.nombre);
        System.out.println("* Precio: " + this.precio);
        System.out.println("* Stock: " + this.stock);
        System.out.println("******************************");
    }

    void printName(){
        System.out.println("Producto: " + this.nombre);
    }

    void agregarDescuento(double descuento){
        this.descuento = descuento;
    }

    void agregarCantidad(int cantidad){
        this.cantidad += cantidad;
    }

    boolean contieneNombre(String busqueda){
        return this.nombre.contains(busqueda);
    }

    double calcularPrecioTotal(){
        double precioSinDescuento = this.precio * this.cantidad;
        // se busca obtener un numero entre 0 y 1;
        double descuento = 1 - (this.descuento / 100);
        return precioSinDescuento * descuento;
    }
}
