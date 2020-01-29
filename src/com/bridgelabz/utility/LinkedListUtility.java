package com.bridgelabz.utility;

public class LinkedListUtility<E> {
	static Node head;
	static int size;
	public LinkedListUtility() {
		size=0;
		head=null;
	}
	
	static class Node<E> 
    { 
        E data; 
        Node<E> next; 
        public Node(E data) 
        { 
            this.data = data; 
            next = null; 
        } 
    }
	//insert data at last
	public static <E> void insert(E data) {
		//@SuppressWarnings("unchecked")
		Node<E> node = new Node<E>(data);
		size++;
		if(head==null) {
			head=node;
		}
		else {
			@SuppressWarnings("unchecked")
			Node<E> n=(Node<E>) head;
			while(n.next!=null) {
				n=n.next;
				
			}
			n.next=node;
			
		}
		
		
	}
	//insert data at index location
	public static <E> void insertAt(int index,E data) {//
		Node<E> node=new Node<E>(data);
		node.data=data;
		node.next=null;
		@SuppressWarnings("unchecked")
		Node<E> n=(Node<E>) head;
		if(index==0) {
			insertAtStart(data);
		}
		else {
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	//delete by using data
	public static<E> void delete(E str) {//
		Node<E> n=head;
		Node<E> prev=head;
		if(n.data.equals(str)) {
			head=n.next;
			size--;
		}
		while(n.next!=null) {
			if(n.data.equals(str)) {
				prev.next=n.next;
				size--;
			}
			prev=n;
			n=n.next;
		}
		if(n.data.equals(str)) {
			if(n.next==null) {
				prev.next=null;
				size--;
			}
		}
	}
	//Delete element from specific index
	public static<E> void deleteAt(int index) {
		Node<E> n=head;
		if(index==0) {
			head=head.next;
		}
		else {
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			n.next=n.next.next;
		}
	}
	//delete last node
	public static <E> void deleteLast() {//
		Node<E> n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=null;
	}
	
	
	
	//code to add data at start
	public static <E> void insertAtStart(E data) {
		// TODO Auto-generated method stub
		Node<E> node=new Node<E>(data);
		node.data=data;
		node.next=null;
		node.next=(Node<E>) head;
		head=node;
	}
	
	
	public int size() {//
		return size;
	}
	public int index(E item) {//
		Node<E> temp=head;
		int count=0;
		while(item!=(temp.data)) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public void show() {//
		// TODO Auto-generated method stub
		Node<E> node = head;
		while (node != null) {
			System.out.print(node.data +" ");
			node = node.next;
		}
		System.out.println();
	}
	//to arrange data into natural ordering
	public static<E extends Comparable<E>>boolean search(E data) {//
		// TODO Auto-generated method stub
		Node<E> n = head;
		while(n!=null) {
			if(data.compareTo((E) n.data)==0) {
				return true;
			}
			n=n.next;
		}
		return false;
	}
}
