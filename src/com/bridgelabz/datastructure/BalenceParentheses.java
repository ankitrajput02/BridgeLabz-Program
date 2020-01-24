package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
//import com.bridgelabz.utility.Utility.Node;

public class BalenceParentheses {
	static Node top;
	class Node<E> 
    { 
        E data; 
        Node next; 
        public Node(E data) 
        { 
            this.data = data; 
            next = null; 
        } 
    }
	public static <E> void push(E data) {
		@SuppressWarnings("unchecked")
		Node n = new Node(data);
		if(top==null) {
			top=n;
		}
		else {
			Node temp=top;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
		
	}
	public static <E> E pop() {
		Node temp=top;
		Node prev=temp;
		E data=null;
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			if(prev==null) {
				top=null;
			}
		}
	}
	public static boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Expression");
		String str=Utility.inputString();
		char[] arr=str.toCharArray();
		isBalence(arr);
		
		//char exp[]= {(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)};
	}
	public static boolean isBalence(char exp[]) {
		for(int i=0;i<exp.length;i++) {
			if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[' ) {
				push(exp[i]);
				
			}
			System.out.println(exp[0]);
		}
		return false;
	}

}
