package com.bridgelabz.objectorientedprograms.inventory.implementation;

import java.util.InputMismatchException;
import java.util.List;
import com.bridgelabz.objectorientedprograms.inventory.model.MyProperties;
import com.bridgelabz.objectorientedprograms.inventory.utility.Utility;

/**
 * 
 *
 */
public class Operations {

	public List<MyProperties> addInventory(List<MyProperties> list) { //method to add new inventory
		MyProperties myProperties = new MyProperties();
		try {
			//taking data from user
			System.out.println("Enter name of inventory: ");
			myProperties.setName(Utility.stringValidation(Utility.inputString()));
			System.out.println("Enter weight of inventory: ");
			myProperties.setWeight(Utility.inputNumber());
			System.out.println("Enter price of inventory: ");
			myProperties.setPrice(Utility.inputFloat());
		} catch (InputMismatchException e) {
			System.out.println("enter valid input!");
		}
		list.add(myProperties);	//adding data to list of inventory
		System.out.println("Inventory added successfully\nTo continue adding press 1\nTo exit press 0 ");
		int a = Utility.inputNumber();
		if (a == 1)
			addInventory(list);
		return list;	//returning list of inventory data
	}

	public List<MyProperties> removeInventory(List<MyProperties> list) {	//method to remove inventory data
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()); //showing available inventories
		}
		boolean find = false;
		System.out.println("Enter name of Inventory to be removed: ");
		try {
			String name = Utility.stringValidation(Utility.inputString()); 
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equalsIgnoreCase(name)) { //matching user input with inventory list
					list.remove(i);	//removing found data
					find = true;
					System.out.println("Inventory removed!!");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		if (!find)
			System.out.println("Inventory not found!");
		
		return list;	//returning list of remaining inventories

	}

	public void calculations(List<MyProperties> list) {	//method to calculate price of inventory
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()); //showing all inventories
		}
		System.out.println("Enter name of inventory to calculate total: ");
		try {
			String inventoryName = Utility.stringValidation(Utility.inputString());

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equalsIgnoreCase(inventoryName)) { //checking user input with the list of inventory
					float total = list.get(i).getWeight() * list.get(i).getPrice(); //calculating total price of inventory
					System.out.println("Total price is: " + total);

				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
	

	}
}