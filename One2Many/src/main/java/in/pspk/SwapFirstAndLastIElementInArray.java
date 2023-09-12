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
		String inputString = "Hello World!";
        
		if (inputString.length() >= 3) {
            String lastThreeChars = inputString.substring(inputString.length() - 3);
            System.out.println("Last three characters: " + lastThreeChars);
            
        } else {
            System.out.println("Input string is too short to extract the last three characters.");
        }
		//insert string at the middle
		String str2 =inputString.substring(0,6)+"Hi"+inputString.substring(5);
		System.out.println(str2);
		//to  print last but one word
		String str3 = "Hello Hi World!";
        String[] words = str3.split(" ");
        
        if (words.length > 1) {
            System.out.println("Last but one word is: " + words[words.length - 2]);
            System.out.println("no of words"+words.length);
        } else {
            System.out.println("There are fewer than 2 words in the string.");
        }
		
		
		
		

	}

}
