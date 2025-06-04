package techlab.practica10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    @GetMapping("/listar")
    public List<String> listarOrdenes(){
        return List.of("orden 1", "orden numero 125");
    }
}
