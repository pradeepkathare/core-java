package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue is not thread-safe
 * 1 : Queue xtends collectin so it has all methods of collections
 * add,offer,poll,peek,remove,element are 6 methods in Queue
 * 
 * Queue uses array for internal implementation
 */
public class ImplementQueue {

	Object[] obj;
	int size;
	int len;
	int front;
	int rear;

	/*
	 * To intitalize values
	 */
	public ImplementQueue(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.obj = new Object[size];
		this.front = -1;
		this.rear = -1;
		this.len = 0;

	}

	/*
	 * To check is empty
	 */
	public boolean isEmpty() {
		return front == -1;
	}

	/*
	 * To check size
	 */

	public int size() {
		return len;
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	/*
	 * to insert values
	 */

	public void add(Object o) {

		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		if(rear == -1) {
			front =0;
		}
		obj[++rear] = o;
		len++;
	}

	/*
	 * To remove elements 
	 * it should remove from front
	 */
	public void remove() {
		
		if(isEmpty()) {
		throw new RuntimeException("No elements to remove :Q is Empty");	
		}
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		obj[front++] = null;
		len--;
	}
	
	/*
	 * display elements
	 */
	public void display() {
		
		for(int i = front ;i<=rear;i++) {
			System.out.println(obj[i].toString());
		}
	}
	public static void main(String[] args) {

		Queue q = new PriorityQueue<>();

		// q.add(e);
		ImplementQueue que = new ImplementQueue(5);
		System.out.println("que.isEmpty() : "+que.isEmpty());
		System.out.println("que.Full() : "+que.isFull());
		
		que.add("abcd");
		que.add("kathare");
		que.add("lmno");
		System.out.println("before removing : ");
		que.display();
		
		que.remove();
		System.out.println("after removing : ");
		que.display();
		System.out.println(que.obj);
		
	}

}
