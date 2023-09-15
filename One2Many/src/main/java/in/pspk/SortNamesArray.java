package in.pspk;

public class SortNamesArray {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Eve", "Charlie"};

        // Sort the names using two nested for loops
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                // Compare names and swap if they are out of order
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
