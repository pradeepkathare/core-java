package com.java.LogicalPrograms.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Pradeep.kathare
 * This Explains how to create binarySearchTree
 * https://www.baeldung.com/java-binary-tree
 */

class NodeBinaryTree{
	
	int value;
	NodeBinaryTree left;
	NodeBinaryTree right;
	
	public NodeBinaryTree(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
}


class BinarySearchTreeOperations{
	NodeBinaryTree root;
	
	public NodeBinaryTree addRecursiveBinaryTree(NodeBinaryTree current, int value) {

		if (current == null) {

			return new NodeBinaryTree(value);
		}
		if (value < current.value) {
			current.left = addRecursiveBinaryTree(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursiveBinaryTree(current.right, value);
		} else {
			return current;
		}
		return current;

	}
	
	public NodeBinaryTree add(int value){
		root = addRecursiveBinaryTree(root, value);
		
		return root;
	}

	/*
	 * Depth-first search is a type of traversal that goes deep as much as
	 * possible in every child before exploring the next sibling.
	 * 
	 * There are several ways to perform a depth-first search: in-order,
	 * pre-order and post-order.
	 * 
	 * 
	 */
	public void traversePreOrder(NodeBinaryTree node) {
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}

	public void traversePostOrder(NodeBinaryTree node){
		if(node !=null){
			traversePostOrder(node.left);
			traversePostOrder(node.right);			
			System.out.print(" "+node.value);
		}
	}
	
	public void traverseInOrder(NodeBinaryTree node){
		
		
		if(node!=null){
			traverseInOrder(node.left);
			System.out.print(" "+node.value);
			traverseInOrder(node.right);	
		}
		
	}
	
	public void findElement(int value,NodeBinaryTree node){
		
		if(node != null){
			
			if(value == node.value){
				System.out.println("elemnt found : "+value);
			}else if(value > node.value){
				findElement(value, node.right);
			}else{
				findElement(value, node.left);
			}
		}else{
			System.out.println("NOt found");
		}
	}
	
	/*
	 * Depth First Search Breadth-First Search
	 * 
	 * This is another common type of traversal that visits all the nodes of a
	 * level before going to the next level.
	 */
	public void traverseBreadthFirstSearch(NodeBinaryTree node){
		Queue listOfNodes = new LinkedList();
		NodeBinaryTree tempNode;
		if(node !=null){
			
			listOfNodes.add(node);
			
			while(!listOfNodes.isEmpty()){
				
				tempNode = (NodeBinaryTree) listOfNodes.remove();
				System.out.println(" "+tempNode.value);
				if(tempNode.left != null){
					listOfNodes.add(tempNode.left);
				}
				
				if(tempNode.right != null){
					listOfNodes.add(tempNode.right);
				}
			}
			
		}
	}
}



public class TestBinarySearchTree {

	public static void main(String[] args) {
		System.out.println("within in TestBinarySearchTree: ");
		
		BinarySearchTreeOperations bt = new BinarySearchTreeOperations();
		NodeBinaryTree root = null;
		root = bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		
		bt.traversePreOrder(root);
		bt.traversePostOrder(root);
		bt.traverseInOrder(root);
		bt.findElement(5, root);
		bt.traverseBreadthFirstSearch(root);
	}
	
}


