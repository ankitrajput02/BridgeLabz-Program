package com.bridgelabz.utility;

public class QueueUtility {
	public static int capacity;
	static int rear;
	static int front;
	static int size=0;
	static int queue[];
	
	/**
	 * @param users
	 */
	public QueueUtility(int users) {
		this.capacity=users;
		front=0;
		rear=0;
		queue=new int[this.capacity];
	}
	
	//Function to Check : Queue is Full or Not
	private static boolean isFull() {
		// TODO Auto-generated method stub
		if(size==capacity) {
			return true;
		}
		return false;
	}
	
	//Function to Check : Queue is Empty or Not
	private static boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) {
			return true;
		}
		return false;
	}
	//Add data to Queue
	public static void enQueue(int data) {
		if(isFull()==true) {
			System.out.println("Queue is Full");
		}
		else {
			rear++;
			if(rear == capacity-1) {
				rear = 0;
			}
			queue[rear] = data;
			size++;	
			
				
		}
		
	}
	
	public static void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			front++;
			if(front==capacity-1) {
				System.out.println(queue[front-1]);
				front=0;
			}
			else {
				System.out.println(queue[front-1]);	
			}
			size--;
		}
	}
	
	
	
	
	
	public static void show(){
		System.out.print("elements: ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[i]+" ");
		}
	}
}
