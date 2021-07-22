package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Address;

public interface IAddressService {

	public Address AddAddress(Address add);
	public Address updateAddress(Address add);
	public Address removeAddress(Address add);
	public List<Address> viewAllAddress(String id);
	public Address viewAddress(Address add);
	
}
