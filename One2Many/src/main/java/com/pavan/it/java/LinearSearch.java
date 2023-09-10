package com.pavan.it.java;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {21,5,9,27,23,36};
		int data = 23;
		boolean found = false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==data) {
				found = true;
				System.out.println("Element Found At Index"+i);
				System.out.println("Element " + data + " found at index " + i);
				break;
				
			}
			
		}
		if(!found) {
			System.out.println("Element is not found in the array");
		}
		
	}
	

}
