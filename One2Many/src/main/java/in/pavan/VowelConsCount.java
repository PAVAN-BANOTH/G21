package in.pavan;


public class VowelConsCount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0;
        int consonantCount = 0;

        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total Vowels: " + vowelCount);
        System.out.println("Total Consonants: " + consonantCount);
    }
}
