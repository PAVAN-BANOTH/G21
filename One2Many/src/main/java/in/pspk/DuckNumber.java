package in.pspk;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        scanner.close();

        if (isDuckNumber(number)) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }
    }

    public static boolean isDuckNumber(String number) {
        // Check if the number contains a '0' and doesn't start with '0'.
        return number.contains("0") && !number.startsWith("0");
    }
}
