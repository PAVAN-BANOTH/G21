package in.pspk;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String inputString = "hello world";
        String[] words = inputString.split(" "); 
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                result.append(firstChar).append(word.substring(1)).append(" ");
            }
        }

        // Remove the trailing space
        String capitalizedString = result.toString().trim();
        System.out.println("Original String: " + inputString);
        System.out.println("Capitalized String: " + capitalizedString);
    }
}

