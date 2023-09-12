package in.pspk;


public class RightRotateByOnePosition {

    public static void main(String[] args) {
        String str = "Love";
        
        if (str.length() > 0) {
            char[] ca = str.toCharArray();
            char last = ca[str.length() - 1];

            for (int i = str.length() - 1; i > 0; i--) {
                ca[i] = ca[i - 1];
            }
            ca[0] = last;

            // Convert the character array back to a string
            String rotatedStr = new String(ca);

            System.out.println("Original String: " + str);
            System.out.println("Right Rotated String (by one position): " + rotatedStr);
        }
    }
}
