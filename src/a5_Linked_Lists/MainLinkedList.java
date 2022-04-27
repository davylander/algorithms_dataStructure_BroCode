package a5_Linked_Lists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		/*
		 * LinkedList = stores Nodes in 2 parts (data + address)
		 * 				Nodes are in non-consecutive memory locations
		 * 				Elements are linked using pointers
		 * 	
		 * 							Singly Linked List
		 * 				Node				Node 				Node
		 *		   [data | address] -> [data | adress]  -> [data | adresss]			
		 *							
		 *							Doubly Linked List
		 * 				Node				 	  		Node
		 *    [adress | data | address]  <->  [adress | data | adresss]
		 *    
		 *	advantages?
		 *	1. Dynamic Data Structure (allocate needed memory while running)
		 *	2. Insertion and Deeletion of Nodes is easy. O(1)
		 *	3. No/Low memory waste		
		 *
		 *	disadvantages? 
		 *	1. Greater memory usage (additional pointer)
		 *	2. No random access of elements (no index [i])
		 *	3. Accessing/searching elements is more time consuming. O(n)
		 *
		 *	uses?
		 *	1. implement Stack/Queues
		 *	2. GPS navigation
		 *	3. Music playlist		
		 */
		
		LinkedList<String> linkedList = new LinkedList<String>();

		/*linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();*/
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll();
		
		linkedList.add(4,"E");
		linkedList.remove("E");
		
		//System.out.println(linkedList.indexOf("F"));
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();
		
		System.out.println(linkedList);
		
	}

}
