package techlab.clases.c5;

public class Cliente {
    String nombre;
    String email;
    int antiguedad;

    // Constructores
    public Cliente(){}

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        this.antiguedad = 1;
    }

    // metodos
    void mostrarDatos(){
        System.out.println("Informe:");
        System.out.printf("El cliente %s tiene registrado como email la siguiente direccion: %s. tiene %s años en la empresa", this.nombre, this.email, this.antiguedad);
    }
}
