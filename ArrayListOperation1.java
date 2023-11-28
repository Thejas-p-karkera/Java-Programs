package Collections;

import java.util.*;

public class ArrayListOperation1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		System.out.println("Enter numbes to be stored in ArrayList.(Enter non-number to stop): ");
		
			while(scan.hasNextInt())
			{
				int n=scan.nextInt();
			
				if(n%2==0)
				{
					al.add(n);
				}
				
			}

		
		System.out.println("The even numbers from the user:"+al);
		
		Collections.sort(al);
		System.out.println("\nThe ArrayList elements after sorting :\n"+al);
		
		Collections.reverse(al);
		System.out.println("\nThe ArrayList after reversing the elements :\n"+al);
		
		int max=Collections.max(al);
		System.out.println("\nThe Maximum value present in the Arraylist is : "+max);
		
		int min=Collections.min(al);
		System.out.println("\nThe Minimum value present in the Arraylist is : "+min);
		
		Collections.reverse(al);
		
		System.out.println("\nEnter a number to search : ");
		scan.next();//to skip the space,enter or new line charecter
		int num=scan.nextInt();
		
		int search=Collections.binarySearch(al,num);
		
		 if(search>=0)
		 {
			 System.out.println("The element is present in the "+search+" index");
		 }
		 else
		 {
				System.out.println("The element is not present in the list"); 
		 }
		 scan.close();
	}

}
