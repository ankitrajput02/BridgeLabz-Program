package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select Array of..\n1.Integers\n2.Doubles\n3.Boolean");
		int n=Utility.inputNumber();
		
		System.out.println("Enter No of Rows And Columns");
		int row=Utility.inputNumber();
		int column=Utility.inputNumber();
		switch(n) {
		case 1:
			Utility.printWriter(row,column);
			break;
		case 2:
			Utility.printWriterDouble(row,column);
			break;
		case 3:
			Utility.printWriterBoolean(row, column);
			break;
		default:
			break;
		}
		
		//Utility.arrayCreate(row,column);
		
		
	}

}
