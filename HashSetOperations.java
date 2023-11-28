package Collections;

import java.util.*;
public class HashSetOperations
{
	public static void main(String[] args)
	{
		Set<Integer> s=new HashSet<Integer>();
		System.out.println("HashSet at initial \n"+s);
		
		s.add(5);
		s.add(10);
		s.add(15);
		s.add(20);
		s.add(25);
		System.out.println("============================================");
		System.out.println("HashSet, After adding some elements \n"+s);
		
		s.contains(10);			//Returns true if this set contains the specified element
		System.out.println("============================================");
		System.out.println("Whether the set contains the number 10? \n"+s.contains(10));
		
		s.remove(15);		//Removes the specified element from this set if it is present
		System.out.println("============================================");
		System.out.println("HashSet, After removing the number 15 \n"+s);
		
		s.size();			//Returns the number of elements in this set 
		System.out.println("============================================");
		System.out.println("What is the size of this HashSet? \n"+s.size());
		
	}

}
