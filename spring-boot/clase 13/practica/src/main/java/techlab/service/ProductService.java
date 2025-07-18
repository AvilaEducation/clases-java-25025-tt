package techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

  // "BASE DE DATOS" en memoria
  private final ArrayList<Producto> productos;

  public ProductService(ProductRepository repository, ProductoRepository repositoryJpa) {
    this.repository = repository;
    this.repositoryJpa = repositoryJpa;
    this.productos = new ArrayList<>();
  }

  public ProductResponseDTO agregarProducto(Producto producto){
    // Podriamos hacer validaciones de negocio antes de enviar el producto a guardar

//    String message = this.repository.agregarProducto(producto);
    this.repositoryJpa.save(producto);
    // esto es un DTO, y sirve para generar respuestas al cliente
    ProductResponseDTO responseDTO = new ProductResponseDTO();
    responseDTO.setMessage("creado");
    return responseDTO;
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
//    Optional<Long> idEnCajita = Optional.ofNullable(id);

//    Long idDisponible = idEnCajita.orElseThrow()

    Producto encontrado = this.repositoryJpa.findById(id).orElseThrow(() -> new ProductNotFoundException(id.toString()));

//    if (encontrado == null){
//      throw new ProductNotFoundException(id.toString());
//    }

    return encontrado;
  }

  public Producto editarProducto(Long id, Double nuevoPrecio){
//    Producto encontrado = this.repository.buscarPorId(id);
    Producto encontrado = this.repositoryJpa.findById(id).orElseThrow(() -> new ProductNotFoundException(id.toString()));

//    if (encontrado == null){
//      throw new ProductNotFoundException(id.toString());
//    }

    encontrado.setPrecio(nuevoPrecio);

    // esto guarda los datos en la base de datos
    this.repositoryJpa.save(encontrado);

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
