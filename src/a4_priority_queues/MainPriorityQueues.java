package a4_priority_queues;

import java.util.*;

public class MainPriorityQueues {

	public static void main(String[] args) {
		/*
		 * Priority Queue = a FIFO data structure that serves elements 
		 * 					with the highest priorities first
		 * 					before elements with lower priority
		 */

		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
				
		/*queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);*/
		
		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
