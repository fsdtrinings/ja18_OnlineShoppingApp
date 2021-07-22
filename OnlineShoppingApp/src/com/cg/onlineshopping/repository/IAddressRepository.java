package com.cg.onlineshopping.repository;

import java.util.List;

import com.cg.onlineshopping.entities.Address;

public interface IAddressRepository {
	public Address AddAddress(Address add);
	public Address updateAddress(Address add);
	public Address removeAddress(Address add);
	public List<Address> viewAllAddress(String id);
	public Address viewAddress(Address add);
}
