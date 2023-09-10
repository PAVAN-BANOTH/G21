package com.pavan.it.java;

import java.util.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArr {
    public static void main(String[] args) {
        List<Integer> arr1 = List.of(1, 3, 5, 7);
        List<Integer> arr2 = List.of(2, 4, 6, 8);

        List<Integer> mergedList = mergeArrays(arr1, arr2);

        System.out.println("Merged List:");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> mergeArrays(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> mergedList = new ArrayList<>(arr1);
        mergedList.addAll(arr2);
        Collections.sort(mergedList);
        return mergedList;
    }
}
