package edu.bit.oops.payment;

import java.util.LinkedList;

public class Users {
	Integer id;
	String name;
	LinkedList<Address> address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Address> getAddress() {
		return address;
	}

	public void setAddress(LinkedList<Address> address) {
		this.address = address;
	}
}
