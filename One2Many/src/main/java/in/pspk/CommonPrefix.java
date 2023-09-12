package in.pspk;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flourish", "flow"};
        String commonPrefix = longestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

    private static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        Arrays.sort(strings);
        String first = strings[0];
        String last = strings[strings.length - 1];
        int minLength = Math.min(first.length(), last.length());

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            commonPrefix.append(first.charAt(i));
        }

        return commonPrefix.toString();
    }
}

