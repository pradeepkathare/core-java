package com.java.muktha.ref;
/*
 * sample example for creating LinkedList 
 * following methods are implemented : few more methods are yet to be implemented
 * but as pr now the following code working as expected
 * 1 : isEmpty 
 * 2 : size 
 * 3 : addFirst
 * 4 : addLast
 * 5 : removeFirst
 * 6 : removeLast
 * 7 : remove 
 */

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

public class ImplementLinkedList {

	static int size;
	Node first;
	Node last;

	public static void main(String[] args) {

		ImplementLinkedList lis = new ImplementLinkedList();
		// lis.a
		lis.addFirst(10);
		lis.addFirst(34);
		lis.addLast(56);
		lis.addLast(364);

		System.out.println(size);
		lis.remove();//34 gets removd
		lis.iterateForward();

		/*
		 * lis.removeFirst(); lis.removeLast(); lis.iterateBackward();
		 * 
		 */

	}
	
	/*
	 * Iterate Forward :
	 */
	
	public void iterateForward() {
		
		Node f = first;
		
		for(Node x = first;x!=null;x=x.next) {
			
		System.out.println("x.item = "+x.data);
		
		}
	}
	/*
	 * remove() :by default it removes first element from the list
	 */

	public void remove() {
		unlinkFirst();
	}

	/*
	 * unlinkFirst :it removes first/head element from the list
	 * 
	 */
	private void unlinkFirst() {
		// TODO Auto-generated method stub

		Node f = first;

		if (f == null) {
			throw new RuntimeErrorException(null, "unlink first rrror");

		}
		Node next = f.next;

		f.data = null;
		f.next = null;

		first = next;
		if (next == null) {
			last = null;
		} else {
			next.prev = null;
		}

		size--;
	}

	/*
	 * add :it add elements to last and by default it return true
	 */
	public boolean add(Object obj) {

		linkLast(obj);

		return true;
	}

	/*
	 * addFirst to insert node at beginning
	 */
	public boolean addFirst(Object obj) {
		linkFirst(obj);

		return true;
	}
	/*
	 * addLast to insert elmetns at end
	 */

	public boolean addLast(Object obj) {
		linkLast(obj);
		return true;
	}

	/*
	 * link first
	 */
	public void linkFirst(Object obj) {

		Node f = first;
		Node newNode = new Node(obj, null, f);
		first = newNode;
		if (f == null) {
			last = newNode;
		} else {
			f.prev = newNode;
		}
		size++;
	}

	/*
	 * link last implemented with the help of source-code
	 */
	public void linkLast(Object obj) {

		Node l = last;
		Node newNode = new Node(obj, l, null);

		last = newNode;

		if (l == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}

		size++;

	}

	/*
	 * size
	 */
	public int size() {
		return size;
	}

	/*
	 * isEmpty
	 */
	public boolean isEmpty() {
		return size() == 0;
	}
}

class Node {

	Object data;
	Node prev;
	Node next;

	public Node() {
		// TODO Auto-generated constructor stub
	}

	Node(Object data, Node prev, Node next) {

		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}