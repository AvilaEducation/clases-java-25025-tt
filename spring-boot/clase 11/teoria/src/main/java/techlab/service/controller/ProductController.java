package techlab.service.controller;

import org.springframework.web.bind.annotation.*;
import techlab.service.entidades.ProductoEjemplo;
import techlab.service.entidades.UsuarioEjemplo;

@RestController
@RequestMapping("/producto")
public class ProductController {
    // -> /producto/*

    @PostMapping("/")
    public String crearProducto(@RequestBody ProductoEjemplo productoEjemplo){
        // Imaginemos el mapeo de JSON a Objeto<ProductoEjemplo>
        /*
        ProductoEjemplo productoEjemplo1 = new ProductoEjemplo();
        productoEjemplo1.setNombre("mouse");
        productoEjemplo1.setPrecio(1236);
        UsuarioEjemplo usuarioEjemplo = new UsuarioEjemplo();
        usuarioEjemplo.setNombre("alksmd@kalsmnd.com");
        usuarioEjemplo.setClave("123");

        productoEjemplo1.setUsuario(usuarioEjemplo);
        */


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

    // .../buscar?nombre="mouse"&orden="asc"&precio=124
    // @RequestParam lo usamos para pasar datos de filtros
    // los nombres tiene que coincidir
    // a menos que indiquemos lo contrario los requestParam son obligatorios, si no los enviamos tira error
    @GetMapping("/buscar")
    public String buscarProductoPorNombre(@RequestParam String nombre, @RequestParam(required = false, defaultValue = "asc") String orden){
        return "buscando,...por nombre " + nombre + " en forma " + orden;
    }
}

