package org.nitish.IMCSWebApp;


public class Order {
	private String productName;
	private String customerName;
	private String quantity;
	public Order() {
		
	}
	public Order(String productName, String customerName, String quantity) {
		super();
		this.productName = productName;
		this.customerName = customerName;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
