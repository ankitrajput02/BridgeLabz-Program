package com.bridgelabz.objectorientedprograms.inventory.model;

import java.io.File;
import java.io.IOException;
import java.util.List;
//import java.util.Properties;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Properties {
	String name;
	double weight;
	double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Properties [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
	
//	Properties properties=new Properties();
//	static ObjectMapper mapper=new ObjectMapper();
//	File file=new File("inventory.json");
//	
//	public List<Properties> readFile() throws IOException	{
//		List<Properties> list=mapper.readValue(file,new TypeReference <List<Properties>>() {
//			
//		} );
//		return list;
//	}
//
//	public void writeFile(List<Properties> list) throws IOException {
//		mapper.enableDefaultTyping().writeValue(file, list);
//		//ObjectMapper.writerWithDefaultPrettyPrinter.
//		//mapper.defaultPrettyPrintingWriter().writeValue(file, list);
//	}
}
