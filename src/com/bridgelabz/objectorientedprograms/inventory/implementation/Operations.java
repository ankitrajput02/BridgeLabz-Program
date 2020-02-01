package com.bridgelabz.objectorientedprograms.inventory.implementation;

import java.util.List;

import com.bridgelabz.objectorientedprograms.inventory.model.Properties;

import com.bridgelabz.objectorientedprograms.inventory.utility.Utility;

/**
 * @author admin1
 *
 */
public class Operations {
	public List<Properties> addInventory(List<Properties> list){
		Properties properties=new Properties();
		System.out.println("Enter Inventory name");
		properties.setName(Utility.inputString());
		System.out.println("Enter Inventory weight");
		properties.setWeight(Utility.inputDouble());
		System.out.println("Enter Inventory price");
		properties.setPrice(Utility.inputDouble());
		list.add(properties);
		System.out.println("Inventory Added...\nPress..\n1.To Add\n2.for Exit");
		int a=Utility.inputNumber();
		if(a==1) {
			addInventory(list);
		}
		return list;
	}
	public List<Properties> removeInventory(List<Properties> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		boolean find=false;
		System.out.println("Enter inventory to be Remove");
		String name=Utility.inputString();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equalsIgnoreCase(name)) {
				list.remove(i);
				find=true;
				System.out.println("Inventory remove");
				break;
			}
		}
		if(!find) {
			System.out.println("Inventory Not Found");
		}
		System.out.println("If Continue to remove Element Press 1 Else\nPress 2 for Exit");
		int choice=Utility.inputNumber();
		if(choice==1) {
			removeInventory(list);
		}
		return list;
		
	}
	public static void calculation(List<Properties> read3) {
		for (int i = 0; i < read3.size(); i++) {
			System.out.println(read3.get(i).getName());
		}
		System.out.println("Enter inventory to be Calculate");
		String name=Utility.inputString();
		for (int i = 0; i < read3.size(); i++) {
			if(read3.get(i).getName().equalsIgnoreCase(name)) {
				float result=(float) (read3.get(i).getPrice()*read3.get(i).getWeight());
				System.out.println("Total of Inventory "+result);
			}
		}
	}

}
