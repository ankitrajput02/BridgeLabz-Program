package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**Title:Program to find number of Binary Search Tree
 * Created By:Ankit Rajput 
 *
 */
public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of Test Cases");
		int cases=Utility.inputNumber();			//Input no of Test Cases
		
		int i=1;
		while(i <= cases) {
			
			System.out.println("\nTest Case #"+i+"\nEnter no of Nodes");
			int nodes=Utility.inputNumber();			//Take input no of Nodes
			System.out.println("Possible Binary Search Trees "+Utility.countBST(nodes));
		i++;
		}
		
	}

}
