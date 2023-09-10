package in.pspk;


public class UniqueCharChecks {
    public static void main(String[] args) {
        String input = "abcdefg";
        boolean containsOnlyUnique = containsOnlyUniqueCharacters(input);
        System.out.println("Contains Only Unique Characters: " + containsOnlyUnique);
    }

    public static boolean containsOnlyUniqueCharacters(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
