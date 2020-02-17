package com.example.pitest;

import java.util.UUID;

public class ProductService {

  private final ProductRepository repository = new ProductRepository();

  public Product create(String name, Double value, Integer quantity) {
    Product product = new Product(UUID.randomUUID().toString(), name, value, quantity);
    System.out.println("Creating " + product);
    if (product.getValue() <= 0) {
      System.out.println("[ERROR] Value must no be zero or negative");
      throw new IllegalArgumentException("Value must no be zero or negative");
    }
    repository.save(product);
    System.out.println("Created " + product);

    return product;
  }

}
