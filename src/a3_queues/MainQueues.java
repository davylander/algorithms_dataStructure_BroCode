package a3_queues;

import java.util.*;

public class MainQueues {

	public static void main(String[] args) {
		/***************************************************************************
		 *  Queue = FIFO data structure. Fist-In Fist-Out (Ex. A line of people)
		 *  		A collection designed for holding elements prior to processing 
		 *  		Liner data structure
		 *  
		 *  		add = enqueue, !!  offer() !!
		 *  		remove = dequeue, !! poll() !!
		 ***************************************************************************
		 *
		 * Where are queues useful?
		 * 
		 * 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		 * 2. Printer Queue (Print jobs should be completed in order)
		 * 3. Used in LinkedLists, PriorityQueues, Breadth-firts search
		 */
		
		

		Queue<String> queue = new LinkedList<String>();
		
		//System.out.println(queue.isEmpty());
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		//System.out.println(queue.isEmpty());
		//System.out.println(queue.size());
		//System.out.println(queue.contains("Harold"));
		
		/*
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();

		System.out.println(queue);
		*/
		
	}

}
