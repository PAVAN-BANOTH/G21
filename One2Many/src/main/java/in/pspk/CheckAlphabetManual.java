package in.pspk;

import java.util.Scanner;

public class CheckAlphabetManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'a' && inputChar <= 'z')) {
            System.out.println(inputChar + " is an alphabet.");
        } else {
            System.out.println(inputChar + " is not an alphabet.");
        }

        scanner.close();
    }
}

