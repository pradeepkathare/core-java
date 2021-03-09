package programming.datastructures;

/*
 * Pradeep.kathare
 * This class first insert elements in linked list then it removes it by using the SingleLinkedList class
 */
public class RemoveDuplicatesSingleLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedOperations singleLinkedOperations = new SingleLinkedOperations();
		
		singleLinkedOperations.insertIntoBegining(40);
		singleLinkedOperations.insertIntoBegining(40);
		singleLinkedOperations.insertIntoBegining(20);
		singleLinkedOperations.insertIntoBegining(10);		
		singleLinkedOperations.insertIntoBegining(10);
		
		System.out.println("Linked List displaying : ");
		singleLinkedOperations.dispalySingleLinkedList();
		
		System.out.println("removing duplicate elements from the linked list");
	}

}
