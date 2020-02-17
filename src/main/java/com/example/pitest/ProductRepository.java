package com.example.pitest;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

  private final Map<String, Product> products = new HashMap<>();

  public Product save(Product product) {
    System.out.println("Saving " + product);
    products.putIfAbsent(product.getId(), product);
    System.out.println("Saved " + product);

    return product;
  }

}