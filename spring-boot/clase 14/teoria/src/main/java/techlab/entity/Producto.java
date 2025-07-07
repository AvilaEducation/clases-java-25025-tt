package techlab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // wrapper
    private Long id;

    private String nombre;
    private double precio;
    private int stock;
    private int cantidadAComprar;
    private String description;

    // El constructor vacio es necesario si usamos la clase para recibir datos con @RequestBody
    public Producto() {

    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cantidadAComprar = 0;
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

}
