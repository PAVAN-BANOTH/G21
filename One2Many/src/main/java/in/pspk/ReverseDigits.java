package in.pspk;

public class ReverseDigits {
    public static void main(String[] args) {
        int num = 456;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num = num / 10; // Remove the last digit
        }

        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);
    }
}
