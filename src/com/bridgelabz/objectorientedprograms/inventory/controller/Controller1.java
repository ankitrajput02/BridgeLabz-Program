package com.bridgelabz.objectorientedprograms.inventory.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


import com.bridgelabz.objectorientedprograms.inventory.model.MyProperties;

public class Controller1 {
	//MyProperties myProperties = new MyProperties();
	ObjectMapper objectMapper = new ObjectMapper();
	
	File file = new File("/home/admin1/workspace-pro/Program/src/Resource/inventorymanagement.json");

	public List<MyProperties> readFile() throws IOException{
		List<MyProperties> list = objectMapper.readValue(file, new TypeReference <List<MyProperties>>() {});
		return list;
	}
	public List<MyProperties> writeFile(List<MyProperties> list) throws IOException {
		// TODO Auto-generated method stub
		objectMapper.enableDefaultTyping().writeValue(file, list);
		return list;
	}
	
}
