package com.example.pitest;

public class Application {

  public static void main(String[] args) {
      ProductService service = new ProductService();
      Product product = service.create("Product B", 55.5, 10);
      System.out.println(product);
  }

}