package a2_stack;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		/*
		 * stack = LIFO data structure. Last-In Last-Out
		 * 		   stores objects into a asort of "vertical tower"
		 * 		   push() to add to the top
		 * 		   pop() to remove from the top
		 */

		/*
		 * Uses of stacks?
		 * 1. Undo/redo features in text editors
		 * 2. moving back/foward through browser history
		 * 3. backtracking algorithms (maze, file directiores)
		 * 4. calling functions (call stack)
		 */
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Valorant");
		stack.push("Skyrim");
		stack.push("League of Legends");
		stack.push("Sea of Thieves");
		stack.push("Axie Infinity");
		
		//String myFavGame = stack.pop();
		//System.out.println(stack.peek());
		
		//System.out.println(stack.search("Brawhalla"));
		//System.out.println(myFavGame);
		
		/*for(int i = 0; i < 1000000000; i++) {
			
			stack.push("Fallout76");
			
		}*/
		
		
	}
	
	

}
