package techlab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import techlab.dto.ProductResponseDTO;
import techlab.entity.Producto;

import java.util.List;
import techlab.exception.ProductNotFoundException;
import techlab.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // ENDPOINTS
    @PostMapping("/")
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody Producto producto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.agregarProducto(producto));
    }

    @GetMapping("/list")
    public List<Producto> obtenerListadoProductos(){
        return this.service.listarProductos();
    }

    @GetMapping("/find")
    public ResponseEntity<List<Producto>> obtenerProductos(@RequestParam String nombreBusqueda){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.service.buscarProducto(nombreBusqueda));
        }catch (ProductNotFoundException e){
            // Pueden buscar sobre @RestControllerAdvice, para manejar las excepciones en otro controller
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // localhost:8080/product/alksjd -> error
    // localhost:8080/product/12434  -> correcto
    // localhost:8080/product/false  -> error
    // localhost:8080/product/123    -> correcto
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id){
        return this.service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Producto editarPrecioProducto(@PathVariable Long id, @RequestParam Double nuevoPrecio){
        return this.service.editarProducto(id, nuevoPrecio);
    }

    @DeleteMapping("/{id}")
    public Producto borrarProducto(@PathVariable Long id){
        return this.service.eliminarProducto(id);
    }

}
