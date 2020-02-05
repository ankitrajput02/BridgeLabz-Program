package com.bridgelabz.objectorientedprograms.inventory.controller;
import java.io.IOException;
import java.util.List;

import com.bridgelabz.objectorientedprograms.inventory.implementation.Operations;
import com.bridgelabz.objectorientedprograms.inventory.model.MyProperties;
import com.bridgelabz.objectorientedprograms.inventory.utility.Utility;
//import com.bridgelabz.objectorientedprograms.inventory.controller.Controller1;
/**
 * @author admin1
 *
 */
public class Controller {
	public static void main(String[] args) throws IOException {
		Controller1 controller1=new Controller1();
		Operations operations=new Operations();
		List<MyProperties> read=controller1.readFile();
		int ch=0;
		for(MyProperties pr : read) {
			System.out.println(pr.getName()+"="+pr.getWeight()*pr.getPrice());
		}
		do{
			System.out.println("Please enter\n1.For Add Inventory\n2.For Remove Inventory\n3.For Calculation of Inventory\n4.Exit");
			ch=Utility.inputNumber();
			switch(ch) {
			case 1:
				List<MyProperties> read1 = controller1.readFile();
				List<MyProperties> list1 = operations.addInventory(read1);
				controller1.writeFile(list1);
				break;
			case 2:
				List<MyProperties> read2 = controller1.readFile();
				List<MyProperties> list2 = operations.removeInventory(read2);
				controller1.writeFile(list2);
				break;
			case 3:
				List<MyProperties> read3= controller1.readFile();
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