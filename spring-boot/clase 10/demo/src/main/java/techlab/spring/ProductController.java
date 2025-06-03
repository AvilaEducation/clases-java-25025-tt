package techlab.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductController {

    // localhost:8080/productos/platillo1
    @GetMapping("/platillo1")
    public String platillo1(){
        return "platillo 1 del restaurante";
    }

    // GET localhost:8080/productos/orden
    @GetMapping("/orden")
    public String platillo12(){
        return "orden mas general";
    }

    // POST localhost:8080/productos/orden
    @PostMapping("/orden")
    public String platillo124(){
        return "orden con post";
    }

    // localhost:8080/productos/bebidas
    @GetMapping("/bebidas")
    public String platillo13(){
        return "bebidas del restaurante";
    }
}
