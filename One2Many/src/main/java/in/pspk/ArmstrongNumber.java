package in.pspk;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while (num > 0) { // Corrected the loop condition
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem; // 1*1*1+5*5*5+3*3*3
        }
        if (temp == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
