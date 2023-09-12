package in.pspk;

public class LeftRotateByOnePosition {

    public static void main(String[] args) {
        String str = "Love";
        char[] ca = str.toCharArray();
        // Perform the left rotation by positions
        //int n = 3;*
        //for(int j = 1;j<=n;j++) {*
        char first = ca[0];//for right:char last = ca[str.length() - 1];
        
       
        
        for (int i = 0; i < str.length() - 1; i++) {
            ca[i] = ca[i + 1];//ca[i]=ca[i-1]
        }
        ca[str.length() - 1] = first;//ca[0]=last
        //}**
        
        // Convert the character array back to a string
        String rotatedStr = new String(ca);
        
        System.out.println("Original String: " + str);
        System.out.println("Left Rotated String: " + rotatedStr);
    }
}
 