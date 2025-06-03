package techlab.practicas.p6;

public class Cliente {
    private String nombre;
    private String email;

    // Constructor
    public Cliente() {}

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.setEmail(email);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }
    }
}
