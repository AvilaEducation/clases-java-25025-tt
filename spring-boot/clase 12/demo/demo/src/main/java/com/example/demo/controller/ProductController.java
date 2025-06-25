package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductService service;

  @Autowired // la anotacion es opcional, lo importante es usar el contructor
  public ProductController(ProductService productService) {

    this.service = productService;
  }

  @GetMapping("")
  ResponseEntity<List<Product>> listar(){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.service.listarProductos());
  }
}
