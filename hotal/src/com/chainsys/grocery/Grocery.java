package com.chainsys.grocery;

import java.util.Arrays;

public class Grocery {
	
	int id;
	int quantity[]=new int[100];
	int amount[]=new int[100];
	String product[]=new String[100];
	int totalamount;
	
	public Grocery() {
		
	}

	public int getId() {
		return id;
	}

	

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public int[] getQuantity() {
		return quantity;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	public String[] getProduct() {
		return product;
	}

	public void setProduct(String[] product) {
		this.product= product;
	}

	

	public Grocery(int id, int[] quantity, int[] amount, String[] product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.amount = amount;
		this.product = product;
	}

	public int[] getAmount() {
		return amount;
	}

	public void setAmount(int[] amount) {
		this.amount = amount;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	

	@Override
	public String toString() {
		return "Grocery [id=" + id + ", quantity=" + quantity + ", amount=" + amount + "]";
	}

	
	
	
	
}
