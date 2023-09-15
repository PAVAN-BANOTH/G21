 package in.pspk;

public class FirstDuplicateInArray {

	    public static void main(String[] args) {
	    	int[] arr = {3, 2, 1, 2, 4, 5, 3};
	         

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                	System.out.println("First Duplicate :"+arr[i]);
	                    return; // Found the first duplicate
	                }
	            }
	        }

	       
	    }
	       

	        
	    }

