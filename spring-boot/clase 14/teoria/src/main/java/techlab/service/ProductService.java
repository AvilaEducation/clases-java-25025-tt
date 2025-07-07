package techlab.service;

import java.util.ArrayList;
import java.util.List;
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
