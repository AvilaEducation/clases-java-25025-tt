package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // genera los getters de todas las propiedades
@Setter
@ToString
@AllArgsConstructor // genera un constructor con todos los propiedades
@NoArgsConstructor // genera un constructor vacio
public class Product {

  private Long id;
  private String nombre;
  private Double precio;
  private String descripcion;
}
