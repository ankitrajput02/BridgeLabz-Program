package com.bridgelabz.objectorientedprograms.inventory.controller;
import java.util.List;
import java.util.*;
import com.bridgelabz.objectorientedprograms.inventory.utility.Utility;

import com.bridgelabz.objectorientedprograms.inventory.implementation.Operations;
import com.bridgelabz.objectorientedprograms.inventory.model.Properties;
//import com.bridgelabz.utility.Utility;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations operations=new Operations();
		Properties properties = new Properties();
	
		List<Properties> read = Utility.readFile();
		for(Properties pr : read) {
			//pr.getName()
			
			System.out.println(pr.getName()+"="+pr.getWeight()*pr.getPrice());
		}
		int choice;
		do {
			System.out.println();
			choice = Utility.inputNumber();
			switch(choice) 
			{
			case 1:
				List<Properties> read1 = Utility.readFile();//controller.readFile();
				List<Properties> list1 = operations.addInventory(list1);
				Utility.writeFile(list1);
				break;
			case 2:
				List<Properties> read2 = Utility.readFile();
				List<Properties> list2= Operations.removeInventory(read2);
				Utility.writeFile(list2);
				break;
			case 3:
				List<java.util.Properties> read3 = Utility.readFile();
				Operations.calculation(read3);
				break;
			case 4:
				return;
			}
			
		}while(choice==4);
	
	
	}
}


