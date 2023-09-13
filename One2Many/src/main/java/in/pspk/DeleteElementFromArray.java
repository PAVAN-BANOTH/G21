package in.pspk;

import java.util.Arrays;

public class DeleteElementFromArray {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToDelete = 2; // Index of the element to delete

        // Create a new array one element smaller
        int[] newArray = new int[arr.length - 1];

        // Copy elements from the original array to the new array, skipping the element to delete
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != indexToDelete) {
                newArray[newIndex++] = arr[i];
            }
        }
    

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArray));
        /*int n = 143;
        while(n > 1) {
        	System.out.println("I LOVE YOU  PAVAN");
        }*/
    }
}

