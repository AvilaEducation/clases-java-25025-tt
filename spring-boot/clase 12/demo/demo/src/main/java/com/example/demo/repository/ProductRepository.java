package com.example.demo.repository;

import com.example.demo.entity.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
  private List<Product> products;

  public ProductRepository() {
    this.products = new ArrayList<>();
    Product product = new Product();
    product.setId(1L);
    product.setNombre("ejemplo");
    products.add(product);
  }

  public List<Product> obtenerTodosLosProductos(){
    return this.products;
  }
}
