package in.pavan;

public class EvenDigitAndOddDigitSum {

    public static void main(String[] args) {

        int num = 45678;
        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
            num = num / 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
