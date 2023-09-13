package in.pspk;

public class MaxDifferenceInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 1, 7, 3};

        if (arr == null || arr.length < 2) {
            // Handle the case where the array has fewer than 2 elements.
            // The difference is not defined in this case, so you can return a specific value or throw an exception.
            throw new IllegalArgumentException("Array should have at least 2 elements.");
        }

        int minElement = arr[0];
        int maxElement = arr[0];

        // Find the minimum and maximum elements in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Calculate and print the maximum difference
        int maxDifference = maxElement - minElement;
        System.out.println("Maximum Difference in the Array: " + maxDifference);
    }
}
