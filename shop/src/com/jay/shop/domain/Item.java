package com.jay.shop.domain;

public class Item {
private int id;
private String name;
float price;
public Item(int id, String name, float price) {
	this.id = id;
	this.name = name;
	this.price = price;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public float getPrice() {
	return price;
}


}
