package techlab.practicas.p7exceptions;

public class ProductNotFoundException extends RuntimeException {
    private String image = "...";
    private String titulo = "...";

    public ProductNotFoundException(String message) {
        super(message);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
