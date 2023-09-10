package com.pavan.it.java;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {5, 9, 21, 23, 27, 36};
        int data = 36;
        int result = binarySearch(arr, data);

        if (result == -1) {
            System.out.println("Element " + data + " not found in the array.");
        } else {
            System.out.println("Element " + data + " found at index " + result);
        }
    }

    public static int binarySearch(int arr[], int data) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] < data) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

