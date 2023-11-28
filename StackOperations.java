package Collections;

import java.util.*;
public class StackOperations
{
	public static void main(String[] args)
	{
		Stack<Integer> s1=new Stack<Integer>();		//Creating object for stack class
		System.out.println("Stack elements at initial \n"+s1);
		
		s1.push(56);		//Adds element to the stack
		s1.push(12);
		s1.push(78);
		s1.push(23);
		s1.push(75);
		System.out.println("======================================================");
		System.out.println("Stack elements after pushing some elements \n"+s1);
		
		s1.pop();		//Removes the top most element present in a stack
		System.out.println("======================================================");
		System.out.println("Stack elements after poping an elements \n"+s1);
		
		s1.peek();		//Returns the top most element present in a stack
		System.out.println("======================================================");
		System.out.println("Top element of the Stack is \n"+s1.peek());
	
		s1.search(12);		//Returns the position of an object from the top of the stack
		System.out.println("======================================================");
		System.out.println("The element 12 is at "+s1.search(12)+" uppermost position");
		
		s1.empty();			//Tests if this stack is empty
		System.out.println("======================================================");
		System.out.println("Whether the stack is empty? \n"+s1.empty());
		
		s1.get(0);		//Returns the element at the specified position in this Vector
		System.out.println("======================================================");
		System.out.println("0 index contains which element? \n"+s1.get(0));
		
		s1.set(0,21);	//Replaces the element at the specified position in this Vector with thes pecified element
		System.out.println("======================================================");
		System.out.println("After replacing the element in the 0 position...");
		System.out.println("0 index contains which element? \n"+s1.get(0));
		
		s1.add(99);		//Appends the specified element to the end of this Vector
		System.out.println("======================================================");
		System.out.println("After adding an element to the end of the stack");
		System.out.println("The Stack elements are... \n"+s1);
		
		s1.indexOf(78);		//Returns the index of the specified element in the stack
		System.out.println("======================================================");
		System.out.println("The index of the element 78 is : "+s1.indexOf(78));
		
	}

}
