package techlab.practicas.p6;

public class Producto {
    // descripcion (atributos)
    String nombre;
    private double precio; // valores entre 1 y 10000
    int stock; // dueño
    int cantidad; // cliente
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

    public void actualizarPrecio(double precio){
        if (precio >= 1 && precio <= 10000){
            this.precio = precio;
        }else{
            System.out.println("ERROR");
        }
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

    void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    boolean contieneNombre(String busqueda){
        return this.nombre.contains(busqueda);
    }

    public double calcularPrecioTotal(){
        double precioSinDescuento = this.precio * this.cantidad;
        // se busca obtener un numero entre 0 y 1;
        double descuento = 1 - (this.descuento / 100);
        return precioSinDescuento * descuento;
    }
}
