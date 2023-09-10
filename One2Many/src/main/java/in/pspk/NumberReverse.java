package in.pspk;

public class NumberReverse {
	public static void main(String[] args) {
        int num = 153;
       
        int rev = 0;
        while (num > 0) { // Corrected the loop condition
            rev = rev *10 + num % 10;
            num = num / 10;
            
        }
        
            System.out.print("Reverse number  :"+rev);
        
    }

}
