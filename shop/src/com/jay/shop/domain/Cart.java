package com.jay.shop.domain;

import java.util.List;

public class Cart {
	private List<CartItem>items;
	private float grandTotal;
	public Cart(List<CartItem> items, float grandTotal) {
	
		this.items = items;
		this.grandTotal = grandTotal;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public float getGrandTotal() {
		return grandTotal;
	}
	
}
