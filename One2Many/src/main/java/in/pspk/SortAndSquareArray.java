package in.pspk;



public class SortAndSquareArray {
    public static void main(String[] args) {
        int[] a = {12, -322, 54, -61, 72, -12};
        int temp;

        // Sorting the array in ascending order using bubble sort
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { // If the current element is greater than the next element
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; // Swap the elements to sort in ascending order
                }
            }
        }

        // Squaring the sorted array
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }

        // Printing the squared and sorted array
        System.out.println("After Sorting in Ascending Order and Squaring:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
