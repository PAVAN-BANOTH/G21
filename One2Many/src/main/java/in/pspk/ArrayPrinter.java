package in.pspk;

import java.util.Arrays;

public class ArrayPrinter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Call the printArray method with the array
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        // Using a for loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Using an enhanced for loop (for-each loop)
        System.out.print("Using enhanced for loop: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Using Arrays.toString()
        System.out.println("Using Arrays.toString(): " + Arrays.toString(arr));

        // Using Java 8 Streams
        System.out.print("Using Java 8 Streams: ");
        Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
        System.out.println();

        // Using a custom method
        System.out.print("Using custom method: ");
        printArrayCustom(arr);
        System.out.println();
    }

    public static void printArrayCustom(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

