package com.jay.shop.domain;

public class CartItem {
	private String name;
	private int id;
	private int quantity;
	private float price;
	public CartItem(String name, int id, int quantity, float price) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getQuantity() {
		return quantity;
	}
	public float getPrice() {
		return price;
	}
	
	
}
