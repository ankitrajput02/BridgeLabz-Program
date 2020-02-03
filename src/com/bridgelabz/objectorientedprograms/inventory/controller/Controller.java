package com.bridgelabz.objectorientedprograms.inventory.controller;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.objectorientedprograms.inventory.implementation.Operations;
import com.bridgelabz.objectorientedprograms.inventory.model.Properties;
import com.bridgelabz.objectorientedprograms.inventory.utility.Utility;



public class Controller {
	public static void main(String[] args) throws IOException {
		//Controller controller=new Controller();
		Operations operations=new Operations();
		List<Properties> read=Utility.readFile();
		int ch=0;
		for(Properties pr : read) {
			System.out.println(pr.getName()+"="+pr.getWeight()*pr.getPrice());
		}
		do{
			System.out.println("Please enter\n1.For Add Inventory\n2.For Remove Inventory\n3.For Calculation of Inventory\n4.Exit");
			ch=Utility.inputNumber();
			switch(ch) {
			case 1:
				List<Properties> read1 = Utility.readFile();
				List<Properties> list1 = operations.addInventory(read1);
				Utility.writeFile(list1);
				break;
			case 2:
				List<Properties> read2 = Utility.readFile();
				List<Properties> list2 = operations.removeInventory(read2);
				Utility.writeFile(list2);
				break;
			case 3:
				List<Properties> read3= Utility.readFile();
				operations.calculations(read3);
				break;
			case 4:			
				return;
			default:
				System.out.println("Please enter correct Input");
			}
		}while(ch!=4);
	}		
}