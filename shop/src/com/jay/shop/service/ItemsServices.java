package com.jay.shop.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jay.shop.domain.CartItem;
import com.jay.shop.domain.Item;

public class ItemsServices {
	
	
	private Map<Integer, Item>db = new HashMap<Integer, Item>();
		
	public ItemsServices() {
		db.put(1,new Item(1, "table", 20.99f));
		db.put(2,new Item(2, "pot", 20.99f));
		db.put(3,new Item(3, "chair", 20.99f));
		
	}
	public List<Item> all(){
		List<Item> items =new ArrayList<>();
		items.add(new Item(1, "table", 20.99f));
		items.add(new Item(2, "pot", 23.99f));
		items.add(new Item(3, "chair", 22.99f));
		return items;
		
	}
	public float calculateGrandTotal(List<CartItem >items){
		float grandTotal=0f;
	
	for(CartItem item:items) {
		grandTotal +=item.getPrice();
		
	}
	return grandTotal;
	}
	
	public Map<Integer, Item> getDb() {
		return db;
	}
	
}
