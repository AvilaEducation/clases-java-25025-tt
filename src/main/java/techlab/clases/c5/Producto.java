package techlab.clases.c5;

public class Producto {
    // descripcion (atributos)
    String nombre;
    double precio;
    int stock;

    // constructores
    public Producto(){}

    public Producto(String nombreProducto){
        this.nombre = nombreProducto;
        this.precio = 0;
        this.stock = 20;
    }

    public Producto(String nombreProducto, double precio){
        this.nombre = nombreProducto;
        this.precio = precio;
        this.stock = 20;
    }

    // funcionamiento (metodos)
    void descontarStock(){
        // comportamiento para descontar stock
        System.out.println("descontando stock....");
    }

    void reporteProducto(){
        System.out.println("El producto " + nombre + " vale " + precio + "$ cada unidad");
        System.out.println("Stock actual: " + stock);
    }

    double precioConDescuento(){
        return precio  - precio * 0.2;
    }

    String nameCapitalize(){
        String textoMinuscula = nombre.toLowerCase();
        String textoSinEspacios = textoMinuscula.trim();
        // dividimos en palabras el texto
        String[] palabras = textoSinEspacios.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            resultado += palabra.toUpperCase().charAt(0) + palabra.substring(1) + " ";
        }

        return resultado;
    }
}
