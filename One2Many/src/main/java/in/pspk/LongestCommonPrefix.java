package in.pspk;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flourish", "flow"};

        if (strings == null || strings.length == 0) {
            System.out.println("Longest Common Prefix: ");
            return;
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

        System.out.println("Longest Common Prefix: " + commonPrefix.toString());
    }
}
