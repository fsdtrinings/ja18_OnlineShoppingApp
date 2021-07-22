package com.cg.onlineshopping.entities;

import java.util.List;

public class Product {
	private String productId;
	private String productName;
	private String brandName;
	private String category;
	private double price;
	private String color;
	private String specification;
	private int quantity;  // quantity in hand or stock , not quantity ordered
	private int userRatings;
	
	private List<Review> review;
}
