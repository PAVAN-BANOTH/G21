package in.pspk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElementAtSpecificLocation {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int newPosition = 2; // Position to insert the new element
        int newValue = 10;   // Value to be inserted

        // Create a new array with one extra element
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements from the original array to the new array up to the specified position
        for (int i = 0; i < newPosition; i++) {
            newArray[i] = originalArray[i];
            System.out.println(" copy from original  up to the specified position  :"+newArray[i]+" ");
        }

        // Insert the new value at the specified position
        newArray[newPosition] = newValue;

        // Copy the remaining elements from the original array to the new array
        for (int i = newPosition; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
            System.out.println("Copy the remaining from original :"+newArray[i + 1]+" ");
            
        }
        

        // Print the new array with the inserted element
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array with Inserted Element: " + Arrays.toString(newArray));
    }
}