package com.bridgelabz.utility;

/**
 * @author admin1
 *
 */
public class QueueLinkedListUtility {
	@SuppressWarnings("rawtypes")
	static Node head;

	public static class Node<E> {
		E data;
		@SuppressWarnings("rawtypes")
		Node next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	//To add data to Queue
	/**
	 * @param <E>
	 * @param data
	 */
	@SuppressWarnings("unchecked")
	public static <E> void enqueue(E data) {
		@SuppressWarnings("rawtypes")
		Node temp;
		@SuppressWarnings("rawtypes")
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	//Add data to queue from front
	@SuppressWarnings("unchecked")
	public static <E> void enqueueFront(E data) {
		@SuppressWarnings("rawtypes")
		Node temp;
		@SuppressWarnings("rawtypes")
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			temp = head;
			temp.next = temp;
			head = temp;
		}
	}
	//Add data to Queue from rear
	public static <E> void enqueueRear(E data) {
		@SuppressWarnings("rawtypes")
		Node temp;
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp = head;
		}
	}
	//To remove data from queue
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <E> E dequeue() {
		E data = null;
		if (!isEmpty()) {
			Node temp = head;
			data = (E) temp.data;
			head = temp.next;
		} else {
			System.out.println("Queue is empty");
		}
		return data;
	}
	//To remove data from front of queue
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <E> E dequeueFront() {
		E data = null;
		if (!isEmpty()) {
			Node temp = head;
			data = (E) temp.data;
			head = temp.next;
		} else {
			System.out.println("Queue is empty");
		}
		return data;

	}
	//To remove data from rear of queue
	@SuppressWarnings("unchecked")
	public static <E> E dequeueRear() {
		E data = null;
		if (!isEmpty()) {
			@SuppressWarnings("rawtypes")
			Node temp = head;
			@SuppressWarnings("rawtypes")
			Node prev = temp;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			data = (E) temp.data;
			prev.next = null;
		} else {
			System.out.println("Queue is empty");
		}
		return data;

	}
	//check queue is empty or not
	public static boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}
	//to print queue
	public static void printQueue() {
		if (!isEmpty()) {
			@SuppressWarnings("rawtypes")
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data +"\t");
				temp = temp.next;
			}
		} else {
			System.out.println("Queue is empty");
		}
	}
}
