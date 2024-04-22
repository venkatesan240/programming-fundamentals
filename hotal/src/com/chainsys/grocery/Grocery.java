package com.chainsys.grocery;

public class Grocery {
	
	int id;
	int quantity;
	int amount;
	
	public Grocery() {
		
	}
	public Grocery(int id, String item, int quantity, int amount, float discount) {
		this.id = id;
		this.quantity = quantity;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
