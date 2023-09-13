package in.pspk;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Perform left rotation by one position
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        /*
          int[] arr = {1, 2, 3, 4, 5};

        // Perform right rotation by one position
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
         */
    }
}
