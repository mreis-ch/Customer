package com.rsachdev.sandbox.Customer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customers")
public class Customer {
	@Id
	private String id;
	private String name;
	private String address;
	private Long phoneNo;

	public Customer() {
	}

	public Customer(String id, String name, String address, Long phoneNo) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}
	
}