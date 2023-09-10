package in.pspk;


public class CharOccurence {
    public static void main(String[] args) {
        // Declare and initialize the input string
        String inputString = "Hello, World!";
        
        // Declare the target character
        char targetCharacter = 'o';

        long count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetCharacter) {
                count++;
            }
        }

        System.out.println("The character '" + targetCharacter + "' appears " + count + " times in the string.");
    }
}

