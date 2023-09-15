 package in.pspk;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 8, 0};
        
        int n = arr.length;
        int nonZeroIndex = 0;
        
        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        
        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

