package techlab.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import techlab.dto.ProductResponseDTO;
import techlab.entity.Producto;
import techlab.exception.ProductNotFoundException;
import techlab.repository.ProductRepository;

@Service
public class ProductService {

  private final ProductRepository repository;

  // "BASE DE DATOS" en memoria
  private final ArrayList<Producto> productos;

  public ProductService(ProductRepository repository) {
    this.repository = repository;
    this.productos = new ArrayList<>();
  }

  public ProductResponseDTO agregarProducto(Producto producto){
    // Podriamos hacer validaciones de negocio antes de enviar el producto a guardar

    String message = this.repository.agregarProducto(producto);

    // esto es un DTO, y sirve para generar respuestas al cliente
    ProductResponseDTO responseDTO = new ProductResponseDTO();
    responseDTO.setMessage(message);
    return responseDTO;
  }

  public List<Producto> listarProductos() {
    return this.repository.listarProductos();
  }

  // GET
  public ArrayList<Producto> buscarProducto(String busqueda) {
    ArrayList<Producto> encontrados = this.repository.buscarProducto(busqueda);

    if (encontrados.isEmpty()){
      throw new ProductNotFoundException(busqueda);
    }

    return encontrados;
  }

  public Producto buscarPorId(Long id) {
    Producto encontrado = this.repository.buscarPorId(id);

    if (encontrado == null){
      throw new ProductNotFoundException(id.toString());
    }

    return encontrado;
  }

  public Producto editarProducto(Long id, Double nuevoPrecio){
    Producto encontrado = this.repository.buscarPorId(id);

    if (encontrado == null){
      throw new ProductNotFoundException(id.toString());
    }

    // esto funciona, porque todo se trabaja en memoria
    encontrado.setPrecio(nuevoPrecio);

    return encontrado;
  }

  // DELETE
  public Producto eliminarProducto(Long id) {
    Producto encontrado = this.repository.buscarPorId(id);

    if (encontrado == null){
      throw new ProductNotFoundException(id.toString());
    }

    return this.repository.eliminarProducto(encontrado);
  }

}
