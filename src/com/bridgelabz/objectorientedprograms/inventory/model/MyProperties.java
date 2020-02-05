package com.bridgelabz.objectorientedprograms.inventory.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Purpose: To set and the data to fields
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MyProperties {

	String name;
	int weight;
	float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
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
		return "MyProperties [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
}