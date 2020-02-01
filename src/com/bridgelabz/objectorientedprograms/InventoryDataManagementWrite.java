package com.bridgelabz.objectorientedprograms;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryDataManagementWrite {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JSONObject inventoryDetails = new JSONObject();
	        inventoryDetails.put("name", "Pulses");
	        inventoryDetails.put("weight", 5);
	        inventoryDetails.put("price", 40);
	         
	        JSONObject inventoryObject = new JSONObject(); 
	        inventoryObject.put("inventory", inventoryDetails);
	         
	        //Second inventory
	        JSONObject inventoryDetails2 = new JSONObject();
	        inventoryDetails2.put("name", "Rice");
	        inventoryDetails2.put("weight", 10);
	        inventoryDetails2.put("price", 60);
	         
	        JSONObject inventoryObject2 = new JSONObject(); 
	        inventoryObject2.put("inventory", inventoryDetails2);
	        
	        //Third inventory
	        JSONObject inventoryDetails3 = new JSONObject();
	        inventoryDetails3.put("name", "Wheat");
	        inventoryDetails3.put("weight", 20);
	        inventoryDetails3.put("price", 30);
	         
	        JSONObject inventoryObject3 = new JSONObject(); 
	        inventoryObject3.put("inventory", inventoryDetails3);
	        
	        
	         
	        //Add inventorys to list
	        JSONArray inventoryList = new JSONArray();
	        inventoryList.add(inventoryObject);
	        inventoryList.add(inventoryObject2);
	        inventoryList.add(inventoryObject3);
	         
	        //Write JSON file
	        try (FileWriter file = new FileWriter("/home/admin1/workspace-pro/Program/src/Resource/inventory2.json")) {
	 
	            file.write(inventoryList.toJSONString());
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
