package com.bridgelabz.objectorientedprograms.inventory.model;

/**
 * Purpose: To set and the data to fields
 * 
 */
public class Properties {

	String name;
	long weight;
	float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Properties [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
}