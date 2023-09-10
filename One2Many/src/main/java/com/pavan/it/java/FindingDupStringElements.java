package com.pavan.it.java;

public class FindingDupStringElements {

	public static void main(String[] args) {
		String[] arr = {"pavan", "rajji", "madhu","pavan", "jyothi", "dany", "rajji", "777", "666"};   
        
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

	}

}
