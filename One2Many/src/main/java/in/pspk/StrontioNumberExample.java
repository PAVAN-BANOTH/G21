package in.pspk;

import java.util.Scanner;

public class StrontioNumberExample {//10th100th digits same
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();

        int n = num;
        int firstDigit = (num * 2) % 1000 / 10;

        if (firstDigit % 10 == firstDigit / 10) {
            System.out.println(n + " is a Strontio number.");
        } else {
            System.out.println(n + " is not a Strontio number.");
        }
    }
}
