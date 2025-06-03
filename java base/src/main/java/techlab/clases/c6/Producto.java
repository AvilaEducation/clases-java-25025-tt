package techlab.clases.c6;

public class Producto {
    private static int idSiguiente = 0;
    int id;
    private String nombre;
    private double precio;

    // constructores
    public Producto(){
        this.id = Producto.idSiguiente;
        Producto.idSiguiente++;
    }

    // getters
    // get + "nombreAtributo"
    // pueden usar el nombre que prefieran, pero por convencion e idealmente hay que seguir la convencion
    // por convencion otras personas van a entender que usando getNombreAttributo acceden al dato que quieren
    public String getNombre(){
        return this.nombre;
    }

    // setters
    // set + "nombreAtributo"
    // pueden usar el nombre que prefieran, pero por convencion e idealmente hay que seguir la convencion
    // por convencion otras personas van a entender que usando setNombreAttributo pueden modificar el dato
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    // y el resto....
}