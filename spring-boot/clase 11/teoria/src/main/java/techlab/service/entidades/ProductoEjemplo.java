package techlab.service.entidades;

import java.util.ArrayList;

// LOMBOK
public class ProductoEjemplo {
    private String nombre;
    private int precio;
    private String categoria;

    // SOLO DE EJEMPLO
    private UsuarioEjemplo usuario;

    // SOLO DE EJEMPLO
    // lo que cambia es la comvencion de nombre:
    // en JSON es snake_case y en java es camelCase
    private ArrayList<Long> idsProductos;

    private boolean ejemplo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public UsuarioEjemplo getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEjemplo usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Long> getIdsProductos() {
        return idsProductos;
    }

    public void setIdsProductos(ArrayList<Long> idsProductos) {
        this.idsProductos = idsProductos;
    }

    public boolean isEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(boolean ejemplo) {
        this.ejemplo = ejemplo;
    }
}