package org.nitish.IMCSWebApp;

public class Product {
	private String productName;
	private String productDescription;
	private String price;
	public Product() {
		
	}
	public Product(String productName, String productDescription, String price) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
