package in.pspk;

public class SumFirstAndLastDigitsInNo {

    public static void main(String[] args) {
        int num = 456;
        int originalNum = num; // Store the original number
        int sum = 0;

        // Find the last digit without modifying the original number
        int lastDigit = num % 10;

        // Find the first digit by repeatedly dividing until we reach the first digit
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;

        sum = firstDigit + lastDigit;

        System.out.println("Original Number: " + originalNum);
        System.out.println("First Digit: " + firstDigit);
        System.out.println("Last Digit: " + lastDigit);
        System.out.println("Sum of First and Last Digits: " + sum);
    }
}
