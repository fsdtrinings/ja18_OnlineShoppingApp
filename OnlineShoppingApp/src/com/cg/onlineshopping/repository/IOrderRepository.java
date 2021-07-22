package com.cg.onlineshopping.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.onlineshopping.entities.Order;

public interface IOrderRepository {

	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public Order removeOrder(Order order);
	public Order viewOrder(Order order);
	
	public List<Order> viewAllOrders(LocalDate date);
	public List<Order> viewAllOrdersByLocation(String city);
	public List<Order> viewAllOrderByUserId(String username);
	public List<Order> viewAllOrderByProductCategoryAndBrand(String productName,String brandName);
	public List<Order> viewAllOrderByBrandName(String brandName);
	public List<Order> viewAllOrderByStatus(String status);
	public List<Order> viewAllOrderByProductCategory(String category);
	
}
