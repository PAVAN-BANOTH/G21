package in.pspk;


import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        
    	/*145 = !1 + !4 + !5

    			=1+4*3*2*1+5*4*3*2*1

    			=1+24+120

    			145=145*/
    	int num = 145;
        int originalNum = num; // Store the original number for comparison
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            
            // Calculate the factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            
            sum += fact; // Add the factorial to the sum
            num /= 10; // Move to the next digit
        }

        // Check if the sum of factorials is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Peterson number.");
        } else {
            System.out.println(originalNum + " is not a Peterson number.");
        }
        
    } 
}
