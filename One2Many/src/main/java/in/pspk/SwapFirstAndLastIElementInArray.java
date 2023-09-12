package in.pspk;

import java.util.Arrays;

public class SwapFirstAndLastIElementInArray {

	public static void main(String[] args) {
		
		
		int[] a = {11, 12, 13, 14};
		int size = a.length;
		int temp = a[0];
		a[0] = a[size-1];
		a[size-1] = temp;
		System.out.println(Arrays.toString(a)+" ");
		// TODO Auto-generated method stub
		String str = "Indiaa";
		int size1 = str.length();
		System.out.println("FirstHalfOfGivenString  : "+str.substring(0, size1/2));
		
		//##############################
		String inputString = "Hello, World!";
        
		if (inputString.length() >= 3) {
            String lastThreeChars = inputString.substring(inputString.length() - 3);
            System.out.println("Last three characters: " + lastThreeChars);
            
        } else {
            System.out.println("Input string is too short to extract the last three characters.");
        }
		
		
		

	}

}
