package techlab.exception;

public class ProductNotFoundException extends TechlabException{

  public ProductNotFoundException(String searchTerm) {
    super(String.format("No se encontro ningun producto. se busco usando el siguiente termino: %s", searchTerm));
  }
}
