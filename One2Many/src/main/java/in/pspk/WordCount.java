package in.pspk;


import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int wordCount = inputString.split("\\s+").length;

        System.out.println("The number of words in the string is: " + wordCount);

        scanner.close();
    }
}
