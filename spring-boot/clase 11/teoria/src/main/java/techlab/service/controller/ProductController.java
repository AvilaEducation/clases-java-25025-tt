package techlab.service.controller;

import org.springframework.web.bind.annotation.*;
import techlab.service.entidades.ProductoEjemplo;

@RestController
@RequestMapping("/producto")
public class ProductController {
    // -> /producto/*

    @PostMapping("/")
    public String crearProducto(@RequestBody ProductoEjemplo productoEjemplo){
        return "creando producto...";
    }

    @GetMapping("/list")
    public String listarProductos(){
        return "productos";
    }

    // .../find/123/price
    // .../find/8734/price
    // .../find/223/price
    // .../find/12445/price
    // .../find/56576/price
    // .../find/numero/price
    // el @PathVariable se usa principalmente para pasar IDs
    @GetMapping("/find/{productId}/price")
    public String buscarProductoPorId(@PathVariable Long productId){
        return "buscando,..." + productId;
    }

    // .../buscar?nombre="mouse"&order="asc"
    // @RequestParam lo usamos para pasar datos de filtros
    @GetMapping("/buscar")
    public String buscarProductoPorNombre(@RequestParam String nombre, @RequestParam(required = false, defaultValue = "asc") String orden){
        return "buscando,...por nombre " + nombre + "en forma " + orden;
    }
}

