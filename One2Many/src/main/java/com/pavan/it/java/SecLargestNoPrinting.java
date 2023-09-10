
package com.pavan.it.java;

public class SecLargestNoPrinting {
	public static void main(String args[] ){
		int a[] = {4, 7, 2, 9, 111, 87, 994};
       
		
		 System.out.print(a);
		
        
        int temp=0;
        int size = a.length;
        for (int i = 0;i<size;i++ ) {
        	for (int j = i+1;j<size;j++ ) {
        		if(a[i]>a[j]) {//for descending order just change "<" remaining will be same
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        			
        		}
        		
        	}
        	
            
        }
        System.out.println();  
        
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < size; i++) {     
            System.out.print(a[i] + " ");    
        } 
        System.out.println();
        System.out.println("sec largest Number is...");
        System.out.println(a[size-2]);//to print 3rd largest just change size-3
        //to print 2nd smallest just change at if condition to < 
        
	}


}
