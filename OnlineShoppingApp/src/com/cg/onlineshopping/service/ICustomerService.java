package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Cart;
import com.cg.onlineshopping.entities.Customer;
import com.cg.onlineshopping.entities.Product;
import com.cg.onlineshopping.entities.Review;

public interface ICustomerService {
	public Customer addCustomer(Customer cust);  // call by User
	public Customer updateCustomerProfile(String username); // call by User and Admin
	public Customer removeCustomer(String username); // call by user and admin
	public Customer viewCustomer(String username);
	public List<Customer> ViewAllCustomers(String city);
	
	public Customer deActivateCustomer(String username);
	
	
	public Cart addProductToCart(Cart cart, Product p,int quantity);
	public Cart removeProductFromCart(Cart cart,Product p);
	public Cart updateProductQuantity(Cart cart, Product p,int quantity);
	public Cart removeAllProducts(Cart cart);
	public List<Product> viewAllProducts(Cart cart);

	
	public List<Review> getAllReviewsByUsername(String username);
}
