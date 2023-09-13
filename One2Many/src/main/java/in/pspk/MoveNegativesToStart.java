package in.pspk;

public class MoveNegativesToStart {
    public static void main(String[] args) {
        int[] arr = {4, -2, 1, -5, 0, 3, -8, -6};

        int n = arr.length;
        int negativeIndex = 0;

        // Move negative elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[negativeIndex];
                arr[negativeIndex] = temp;
                negativeIndex++;
            }
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

