package techlab.practica10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class DemoController {

    // url-base/demo-controller/...

    // GET url-base/demo-controller/saludo
    @GetMapping("/listar")
    public String saludo(){
        return "hola mundo";
    }

    // POST url-base/demo-controller/saludo
    @PostMapping("/")
    public String creacionDeSaludo(){
        return "hola mundo";
    }

    // url-base/demo-controller/bienvenida
    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "te damos la bienvenida al sistema";
    }
}
