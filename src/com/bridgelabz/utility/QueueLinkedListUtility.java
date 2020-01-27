package com.bridgelabz.utility;

public class QueueLinkedListUtility {
	static Node head;
	static class Node<E> 
    { 
        E data; 
        Node next=null; 
        public Node(E data) 
        { 
            this.data = data; 
            next = null; 
        } 
    }
	//Add data in the Linked List queue
	public static<E> void enqueue(E data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	//To remove Elements from Queue (Front side)
	public static <E> E dequeue() {
		E data=null;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			Node temp = head;
			data = (E) temp.data;
			temp=temp.next;
		}
		return data;
	}
	
	//Dequeue Front
	public static<E> E removeFront() {
		E data=null;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			Node temp=head;
			data=(E) temp.data;
			head=temp.next;
		}
		return data;
	}
	//Dequeue Rear
	public static<E> E removeRear() {
		E data=null;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			Node temp=head;
			Node prev=temp;
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			data=(E) temp.data;
			prev.next=null;
		}
		return data;
	}
	//Check queue is empty or not
	public static boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	//to print data of the Queue
	public static <E> void displayQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			Node <E> temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"");
				temp=temp.next;
			}
		}
	}
}
