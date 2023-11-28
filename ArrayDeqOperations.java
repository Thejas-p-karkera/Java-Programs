package Collections;

import java.util.*;

public class ArrayDeqOperations
{
	public static void main(String[] args)
	{
		Deque<Integer> q=new ArrayDeque<Integer>();
		System.out.println("ArrayDeque elements at initial \n"+q);
		
		q.add(34);				//Adds element to the ArrayDeque
		q.offer(25);			//Adds element to the ArrayDeque
		q.offer(50);
		q.offer(38);
		q.offer(48);
		System.out.println("=========================================================");
		System.out.println("ArrayDeque elements \n"+q);
		
		q.poll();				//Removes the top element from the ArrayDeque
		System.out.println("========================================================");
		System.out.println("ArrayDeque,After deleting an element \n"+q);
		
		q.peek();              //Returns the top element of ArrayDeque
		System.out.println("=========================================================");
		System.out.println("The top element of the ArrayDeque is : "+q.peek());
		
		q.peekLast();         //Returns the last element of ArrayDeque
		System.out.println("=========================================================");
		System.out.println("The last element of the ArrayDeque is : "+q.peekLast());
		
		q.peekFirst();        //Returns the first element of ArrayDeque
		System.out.println("=========================================================");
		System.out.println("The first element of the ArrayDeque is : "+q.peekFirst());
		
		q.offerFirst(67);		//Inserts the specified element at the front of this deque
		System.out.println("=========================================================");
		System.out.println("ArrayDeque,After adding an element at the front end \n"+q);
		
		q.offerLast(98);		//Inserts the specified element at the rear of this deque
		System.out.println("=========================================================");
		System.out.println("ArrayDeque,After adding an element at the rear end \n"+q);
		
		q.pollFirst();			//Retrieves and removes the first element of this deque
		System.out.println("=========================================================");
		System.out.println("ArrayDeque,After deleting the first element \n"+q);
		
		q.pollLast();			//Retrieves and removes the last element of this deque
		System.out.println("=========================================================");
		System.out.println("ArrayDeque,After deleting the last element \n"+q);
	}

}
