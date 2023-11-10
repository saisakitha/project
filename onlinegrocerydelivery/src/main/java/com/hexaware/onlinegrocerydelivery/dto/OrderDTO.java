package com.hexaware.onlinegrocerydelivery.dto;

import java.time.LocalDate;

public class OrderDTO {
	
	private int order_id;
	private int customer_id;
	private LocalDate order_date;
	private String delivery_address;
	private String payment_method;
	private double total_amount;
	
	
	
	public OrderDTO() {
		super();
	}



	public OrderDTO(int order_id, int customer_id, LocalDate order_date, String delivery_address, String payment_method,
			double total_amount) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.order_date = order_date;
		this.delivery_address = delivery_address;
		this.payment_method = payment_method;
		this.total_amount = total_amount;
	}



	public int getOrder_id() {
		return order_id;
	}



	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public LocalDate getOrder_date() {
		return order_date;
	}



	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}



	public String getDelivery_address() {
		return delivery_address;
	}



	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}



	public String getPayment_method() {
		return payment_method;
	}



	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}



	public double getTotal_amount() {
		return total_amount;
	}



	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}



	@Override
	public String toString() {
		return "OrderDTO [order_id=" + order_id + ", customer_id=" + customer_id + ", order_date=" + order_date
				+ ", delivery_address=" + delivery_address + ", payment_method=" + payment_method + ", total_amount="
				+ total_amount + "]";
	}
	
	

}
