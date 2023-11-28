package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> sortedEvenNumbers = new ArrayList<>();

        // Read even numbers from the user and add them to the evenNumbers ArrayList
        System.out.println("Enter even numbers (enter a non-even number to stop):");
        while (true) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                break;
            }
        }

        // Sort the even numbers
        sortedEvenNumbers.addAll(evenNumbers);
        Collections.sort(sortedEvenNumbers);

        // Reverse the list
        Collections.reverse(sortedEvenNumbers);

        // Find the max and min values
        int maxValue = Collections.max(sortedEvenNumbers);
        int minValue = Collections.min(sortedEvenNumbers);

        System.out.println("Sorted and reversed even numbers: " + sortedEvenNumbers);
        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);

        // Read a value to search for
        System.out.print("Enter a value to search for: ");
        int searchValue = scanner.nextInt();

        // Perform a binary search
        int index = Collections.binarySearch(sortedEvenNumbers, searchValue);

        if (index >= 0) {
            System.out.println(searchValue + " found at index " + index);
        } else {
            System.out.println(searchValue + " not found in the list.");
        }
    }
}

