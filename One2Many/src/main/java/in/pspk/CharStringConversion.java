package in.pspk;

public class CharStringConversion {
    public static void main(String[] args) {
        // Convert char to String
        char charValue = 'A';
        String stringValue = String.valueOf(charValue);
        System.out.println("Char to String: " + stringValue);

        // Convert String to char
        String strValue = "Hello";
        char[] charArray = strValue.toCharArray();
        if (charArray.length > 0) {
            char firstChar = charArray[0];
            System.out.println("String to Char: " + firstChar);
        } else {
            System.out.println("String is empty.");
        }
    }
}

