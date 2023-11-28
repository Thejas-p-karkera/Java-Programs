package Collections;

import java.util.*;
public class ArrayListAssignment
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al1.add(82);			//Adding some random numbers to the ArrayList 'al1'
		al1.add(39);
		al1.add(48);
		al1.add(35);
		al1.add(72);
		al1.add(75);
		al1.add(46);
		al1.add(27);
		al1.add(12);
		System.out.println("ArrayList elements \n"+al1);
		
		for(int n:al1)				//For Each Loop
		{
			if(n%2 ==0)				//Checking for Even numbers
			{
				al2.add(n);			//Storing Even numbers in ArrayList 'al2'
			}
		}
		System.out.println("========================================================");
		System.out.println("ArrayList elements, after removing all odd numbers \n"+al2);
		
		int sum=0;					//Initializing
		for(int n1:al2)
		{
				sum+=n1;			//Adding Even numbers
			}
		
		System.out.println("========================================================");
		System.out.println("Sum of all even numbers present in ArrayList is  : "+sum);
		
		
	}

}
