package com.hexaware.onlinegrocerydelivery.dto;

public class SubstitutionDTO {

	private int substitution_id;
	private int order_id;
	private int product_id;
	private int substitute_product_id;
	
	public SubstitutionDTO() {
		super();
	}

	public SubstitutionDTO(int substitution_id, int order_id, int product_id, int substitute_product_id) {
		super();
		this.substitution_id = substitution_id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.substitute_product_id = substitute_product_id;
	}

	public int getSubstitution_id() {
		return substitution_id;
	}

	public void setSubstitution_id(int substitution_id) {
		this.substitution_id = substitution_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getSubstitute_product_id() {
		return substitute_product_id;
	}

	public void setSubstitute_product_id(int substitute_product_id) {
		this.substitute_product_id = substitute_product_id;
	}

	@Override
	public String toString() {
		return "SubstitutionDTO [substitution_id=" + substitution_id + ", order_id=" + order_id + ", product_id="
				+ product_id + ", substitute_product_id=" + substitute_product_id + "]";
	}
	
	
	

}
