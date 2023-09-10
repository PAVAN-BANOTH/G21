package com.pavan.it.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArr {
    public static void main(String[] args) {
        /*List<Integer> arr1 = List.of(1, 3, 5, 7);
        List<Integer> arr2 = List.of(2, 4, 6, 8);

        List<Integer> merg = new ArrayList<>();
        merg.addAll(arr1);
        merg.addAll(arr2);
        
        //merg.stream().sorted();
        System.out.println("Before sorting: " + merg);

        Collections.sort(merg);
        System.out.println("After sorting: " + merg);*/
    	//55555555555555555555555555555555555555555555555555
    	int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0; // Index for arr1
        int j = 0; // Index for arr2
        int k = 0; // Index for mergedArray

        // Merge the arrays until one of them is fully traversed
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy the remaining elements from arr1, if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy the remaining elements from arr2, if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;

       
    }

   
}