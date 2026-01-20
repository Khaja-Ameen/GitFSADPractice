package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class ProductOrder {
	

	private int orderid;
	private String customerName;
	private String productName;
	private int quantity;
	public ProductOrder(@Value("100") int orderid, @Value("SHAIK KHAJA AMEEN") String customerName){
		this.orderid=orderid;
		this.customerName=customerName;
	}
	@Value("Laptop")
	public void setProductName(String productName) {
		this.productName=productName;
	}
	@Value("4")
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void display() {
		System.out.println("Following are order details");
		System.out.println("Order Id: "+orderid);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Product Name: "+productName);
		System.out.println("Quantity: " +quantity);
	}
}
