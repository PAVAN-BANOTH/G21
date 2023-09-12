package in.pspk;


public class CountingNoOfCDSO {
    public static void main(String[] args) {
        String inputString = "Hello@!#, 123 World!";

        int letterCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int specialCharCount = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isSpaceChar(c)) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Input String: " + inputString);
        System.out.println("Letter count: " + letterCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Special character count: " + specialCharCount);
    }
}
