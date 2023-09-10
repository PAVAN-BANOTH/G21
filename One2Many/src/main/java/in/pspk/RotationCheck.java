package in.pspk;


public class RotationCheck {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        boolean isRotated = isRotatedString(str1, str2);
        System.out.println("Is Rotated String: " + isRotated);
    }

    public static boolean isRotatedString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
