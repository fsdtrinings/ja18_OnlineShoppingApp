package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Product;

public interface IProductService {
 public List<Product> viewAllProducts();
 public Product addProduct(Product product);
 public Product updateProduct(Product product);
 public Product viewProduct(int id);
 public List<Product> viewProductsByCategory(String cat); 
 public Product removeProduct(String prodid);
 
 // business operations 
 
 
 
 
}
