package in.pspk;


public class StrPermutation {
    public static void main(String[] args) {
        String str = "abc"; // Change this to the string for which you want to find permutations
        generatePermutations(str, "");
    }

    public static void generatePermutations(String input, String permutation) {
        int n = input.length();

        // If the permutation is of the same length as the input, print it
        if (n == 0) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < n; i++) {
                // Choose a character from the input
                char ch = input.charAt(i);

                // Create a new string without the chosen character
                String newInput = input.substring(0, i) + input.substring(i + 1);

                // Recursively generate permutations for the new input
                generatePermutations(newInput, permutation + ch);
            }
        }
    }
}
