package com.hexaware.onlinegrocerydelivery.dto;

public class ProductDTO {
	private int product_id;
	private String product_name;
	private String category;
	private String brand;
	private float price;
	private int quantity;
	
	
	public ProductDTO() {
		super();
	}


	public ProductDTO(int product_id, String product_name, String category, String brand, float price, int quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "ProductDTO [product_id=" + product_id + ", product_name=" + product_name + ", category=" + category
				+ ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

	

}
