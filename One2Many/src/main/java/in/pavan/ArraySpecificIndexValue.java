package in.pavan;

public class ArraySpecificIndexValue {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int specificIndex = 2; // Index of the specific number
        
        if (specificIndex >= 0 && specificIndex < numbers.length) {
            int specificValue = numbers[specificIndex];
            System.out.println("Value at Specific Index " + specificIndex + ": " + specificValue);
        } else {
            System.out.println("Invalid index.");
        }
           }
}