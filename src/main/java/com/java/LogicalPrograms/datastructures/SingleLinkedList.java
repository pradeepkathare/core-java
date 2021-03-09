package com.java.LogicalPrograms.datastructures;

/*
 * Pradeep.kathare
 * Simple implementaion for single linked list
 */
public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("with in LinkedList :");
		SingleLinkedOperations slp = new SingleLinkedOperations();
		
		slp.insertIntoBegining(10);
		slp.insertIntoBegining(20);
		slp.insertIntoIndex(30, 1);
		
		System.out.println("DISPLAYING elements before deleteing :");
		slp.dispalySingleLinkedList();
		
		slp.deleteKey(30);
		System.out.println("DISPLAYING elements after deleteing :");
		slp.dispalySingleLinkedList();
		
		slp.deletAtpos(1);
		System.out.println("DISPLAYING elements after deleteing :");
		slp.dispalySingleLinkedList();
	}

}


class Node {
	
	int value;
	Node next;
	
	public Node(int value,Node next) {
		
		this.next = next;
		this.value = value;
	}
	
}

class SingleLinkedOperations{
	
	
	Node start = null;
	Node end = null;
	
	
	void insertIntoBegining(int value){
		System.out.println("within insert linkedlist");
		Node temp = new Node(value,null);
		if(start == null){
			start = temp;
			end = start;
		}else{
			temp.next = start;
			start = temp;
		}
		
	}
	
	void insertIntoIndex(int value,int pos){
		
		System.out.println("witih in InsertIntoIndex");
		Node ptr = start;
		int count = 0;
		while(ptr != null){
			
			if(count == pos-1){
				
				Node temp = new Node(30, null);
				temp.next = ptr.next;
				ptr.next = temp;
			}else{
				
				ptr = ptr.next;
			}
			count++;
		}
	
	}
	
	void deleteKey(int key){
		
		Node ptr = start;
		Node prev = null;
		
		while(ptr != null){
			
			if(ptr.value == key){
			System.out.println("deleting value : "+ptr.value);
				prev.next = ptr.next;
				break;
			}else{
				prev = ptr;
				ptr = ptr.next;
			}
		}
		
	}
	
	void deletAtpos(int pos){
		
		Node ptr = start;
		Node prev = null;
		int count = 0;
		
		while(ptr!=null){
		
			if(count == pos){
				System.out.println("deleting value : "+ptr.value);
				prev.next = ptr.next;
				break;
			}else{
				prev = ptr;
				ptr = ptr.next;
			}
			count++;
		}
	}
	void dispalySingleLinkedList(){
		
		Node endptr = start;
		
		if(endptr == null){
			System.out.println("empty");
		}else{
			while(endptr != null){
				
				System.out.print("value : "+endptr.value);
				endptr = endptr.next;
			}
			//System.out.println(endptr.value);
		}
		
	}
}