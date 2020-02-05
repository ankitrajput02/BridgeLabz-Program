package com.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryDataManagementRead {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		JSONParser jsonParser=new JSONParser();
		/**FileReader:reads Text from character files
		 * 
		 **/
		try(FileReader reader=new FileReader("/home/admin1/workspace-pro/Program/src/Resource/inventory1.json")){
			Object obj=jsonParser.parse(reader);
			JSONArray inventoryList=(JSONArray) obj;
			System.out.println(inventoryList);
			/**forEach:Performs the given action for each element of the Iterable until all elements have been processed
			 *  
			 **/
			inventoryList.forEach( inventory -> parseInventoryObject( (JSONObject) inventory ) );
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void parseInventoryObject(JSONObject inventory) {
		// TODO Auto-generated method stub
		JSONObject inventoryObject =(JSONObject) inventory.get("inventory");
		//get inventory name
		String name = (String) inventoryObject.get("name");    
		System.out.println(name);

		//Get inventory weight
		long weight = (long) inventoryObject.get("weight");		//type conversion (long)
		System.out.println(weight);

		//Get inventory price
		long price = (long) inventoryObject.get("price");    //type conversion (long)
		System.out.println(price);
		long result=weight*price;	
		//Math.multiplyExact(weight, price);	//Multiplication done using built-in Math function
		System.out.println("Value for Inventory "+result);
	}
}