package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.parsing.ProblemReporter;
import org.springframework.stereotype.Service;

// DATOS DE SPRING BOOT
// BEAN 1: ProductService -> spring boot crea un objeto de ese tipo
// BEAN 2: ProductController -> spring boot crea un objeto de ese tipo

@Service
public class ProductService {

  private ProductRepository repository;

  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  // Logica del servicio
  public List<Product> listarProductos(){
    List<Product> products = this.repository.obtenerTodosLosProductos();

    return products;
  }

}
