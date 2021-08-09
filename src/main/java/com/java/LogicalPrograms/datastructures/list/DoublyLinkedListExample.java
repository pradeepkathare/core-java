package com.java.LogicalPrograms.datastructures.list;

public class DoublyLinkedListExample {

	public static void main(String[] args) {
	
		DoubleLinkedList list = new DoubleLinkedList();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.display(list);
	}

	
	
}


class Node{
	
	Node prev;
	int data;
	Node next;
	
	Node(Node prev,int data,Node next){
		this.prev = prev;
		this.data=data;
		this.next=next;
	}	
	
}

class DoubleLinkedList{
	
	Node head;
	Node tail;
	
	public void insert(DoubleLinkedList list,int data) {
		System.out.println("inserting ="+data);
		Node temp = new Node(null, data, null);
		if(head==null) {
			head=temp;
			tail=head;
		}else {
			temp.prev = tail;
			tail.next = temp;
			tail=temp;
		}
		
	}
	
	public void display(DoubleLinkedList list) {
		Node ptr = list.head;
		if(ptr==null) {
			System.out.println("Empty list");
		}
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}