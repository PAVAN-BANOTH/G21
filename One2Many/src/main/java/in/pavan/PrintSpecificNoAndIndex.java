package in.pavan;


public class PrintSpecificNoAndIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int targetNumber = 30; // Number to find the index for

        int numberIndex = -1; // Initialize with a default value

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetNumber) {
                numberIndex = i;
                break;
            }
        }

        if (numberIndex != -1) {
            System.out.println("Index of Number " + targetNumber + ": " + numberIndex);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
