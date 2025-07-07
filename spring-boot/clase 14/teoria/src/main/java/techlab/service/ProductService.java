package techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import org.springframework.stereotype.Service;
import techlab.dto.ProductResponseDTO;
import techlab.entity.Producto;
import techlab.exception.ProductNotFoundException;
import techlab.repository.ProductRepository;
import techlab.repository.ProductoRepository;

@Service
public class ProductService {

  private final ProductRepository repository;
  private ProductoRepository repositoryJpa;

  public ProductService(ProductRepository repository, ProductoRepository repositoryJpa) {
    this.repository = repository;
    this.repositoryJpa = repositoryJpa;
  }

  public Producto agregarProducto(Producto producto){
    // Podriamos hacer validaciones de negocio antes de enviar el producto a guardar

    Producto productoGuardado = this.repositoryJpa.save(producto);

    return productoGuardado;
  }

  public List<Producto> listarProductos() {
//    return this.repository.listarProductos();
    return this.repositoryJpa.findAll();
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
//    Producto encontrado = this.repository.buscarPorId(id);
    Optional<Producto> encontrado = this.repositoryJpa.findById(id);
    // Optinal: es una cajita para enviar datos

    if (encontrado.isEmpty()){
      throw new ProductNotFoundException(id.toString());
    }

    return encontrado.get();
  }

  // funciona igual que <buscarPorId> pero es mas lindo
  public Producto buscarPorIdv2(Long id) {
    return this.repositoryJpa.findById(id).orElseThrow(() -> new ProductNotFoundException(id.toString()));
  }

  public Producto editarProducto(Long id, Double nuevoPrecio){
    Producto encontrado = this.buscarPorId(id);

    encontrado.setPrecio(nuevoPrecio);
    // el save sirve para actualizar entidades existentes
    this.repositoryJpa.save(encontrado);

    return encontrado;
  }

  // DELETE
  public Producto eliminarProducto(Long id) {
    Producto encontrado = this.buscarPorId(id);

    this.repositoryJpa.delete(encontrado);

    return encontrado;
  }

}
