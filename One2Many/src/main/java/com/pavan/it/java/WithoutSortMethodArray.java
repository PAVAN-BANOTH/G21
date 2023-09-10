package com.pavan.it.java;
import java.util.*;


public class WithoutSortMethodArray {
	public static void main(String args[] ){
		int a[] = {4, 4, 7, 2, 9, 111, 87, 994};
       
       /* for (int arr : a) {
        System.out.print(+arr+" ");	
            
        }
        */
        int temp=0;
        for (int i = 0;i<a.length;i++ ) {
        	for (int j = i+1;j<a.length;j++ ) {
        		if(a[i]>a[j]) {//for descending order just change "<" remaining will be same
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        			
        		}
        		
        	}
        	
            
        	
        }
        System.out.println();  
        
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
        } 
        
	}

}
