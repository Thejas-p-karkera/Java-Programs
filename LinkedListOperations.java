package Collections;

import java.util.*;
public class LinkedListOperations
{
	public static void main(String[] args)
	{
		LinkedList ll1=new LinkedList();		//creating an object for LinkedList
		System.out.println("1st LinkedList, at initial \n"+ll1);
		
		ll1.add(10);							//Adding elements to LinkedList ll1
		ll1.add(36.5f);
		ll1.add('A');
		ll1.add("Thejas");
		System.out.println("=====================================================================================");
		System.out.println("1st LinkedList, after adding some elements \n"+ll1);
		
							 //Removing element from the LinkedList
		ll1.remove(1);		//Where 1 is the index of an element which is to be removed
		System.out.println("=====================================================================================");
		System.out.println("1st LinkedList, after removing an element \n"+ll1);
		
		
		LinkedList ll2=new LinkedList();		//creating another object for LinkedList
		
		ll2.add(20);							//Adding elements to LinkedList ll2
		ll2.add(70.14);
		ll2.add('B');
		ll2.add("karkera");
		
		
		ll1.addAll(ll2);		//Adding all the elements of ll2 to ll1
		System.out.println("=====================================================================================");
		System.out.println("1st LinkedList, after adding all elements of 2nd collection to 1st collection \n"+ll1);
		
		
		ll1.removeAll(ll2);		//Removing all the elements of ll2 from ll1
		System.out.println("=====================================================================================");
		System.out.println("1st LinkedList, after removing all elements of 2nd collection from 1st collection \n"+ll1);
		
		
		ll1.contains("Thejas");	//Returns true if this list contains the specified element
		System.out.println("=====================================================================================");
		System.out.println("Checking whether the 1st LinkedList contains the \"Thejas\" element \n"+ll1.contains("Thejas"));
		
		
		ll1.containsAll(ll2);	//Returns true if this list contains all of the elements of the specified collection.
		System.out.println("=====================================================================================");
		System.out.println("Checking whether the 1st LinkedList contains all of the elements of the 2nd collection \n"+ll1.containsAll(ll2));
		
		
		ll2.isEmpty();		//Returns true if this list contains no elements
		System.out.println("=====================================================================================");
		System.out.println("Checking whether the 2nd LinkedList is empty or not \n"+ll2.isEmpty());
		
		
		ll2.clear();		//Removes all of the elements from this list
		System.out.println("=====================================================================================");
		System.out.println("After deleting all the elements of 2nd LinkedList \n"+ll2);
		
		
		ll2.isEmpty();		//Returns true if this list contains no elements
		System.out.println("=====================================================================================");
		System.out.println("Checking whether the 2nd LinkedList is empty or not \n"+ll2.isEmpty());
		
		
		ll1.size();			//Returns the number of elements in this list
		System.out.println("=====================================================================================");
		System.out.println("Counting the number of elements in 1st LinkedList \n"+ll1.size());
		
	}

}
