package in.pspk;

public class RotationCheckerTwoString {

	public static void main(String[] args) {
		 String str1 = "abcde";
	     String str2 = "deabc";

	        // Check if both strings have the same length and are not empty
	        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
	            System.out.println("No, " + str2 + " is not a rotation of " + str1);
	        } else {
	            // Concatenate str1 with itself
	            String concatenatedStr = str1 + str1;

	            // Check if str2 is a substring of concatenatedStr
	            if (concatenatedStr.contains(str2)) {
	                System.out.println("Yes, " + str2 + " is a rotation of " + str1);
	            } else {
	                System.out.println("No, " + str2 + " is not a rotation of " + str1);
	            }
	        }

	}

}
