package com.cg.onlineshopping.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Order {

	private String orderId;
	private String userName;
	private String orderStatus; // registered , dispatched , delievered
	private LocalDate orderDate;
	private Map<Product, Integer> products;
	private int totalAmount;

	
}


// 101 , ashish123 ,  registered , 22 july 2021 , 500
