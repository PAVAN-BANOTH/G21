package in.pspk;

public class BinarySearch {
    // Function to perform binary search on a sorted array
    // Returns the index of the target element if found, or -1 if not found
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is less than the middle element, search the left half
            if (arr[mid] > target) {
                right = mid - 1;
            }

            // If the target is greater than the middle element, search the right half
            else {
                left = mid + 1;
            }
        }

        // Target element not found
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
