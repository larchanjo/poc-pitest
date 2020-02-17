package com.example.pitest;

import junit.framework.TestCase;
import org.junit.Assert;

public class ProductServiceTest extends TestCase {

  public void testCreate() {
    ProductService service = new ProductService();
    Product product = service.create("Product B", 55.5, 10);

    Assert.assertEquals("Product B", product.getName());
    Assert.assertEquals(Double.valueOf(55.5), product.getValue());
    Assert.assertEquals(Integer.valueOf(10), product.getQuantity());
  }

}