package in.pspk;


public class SwapStringExample {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("Before swapping:\na: " + a + "\nb: " + b);

        // Swapping strings using split method concisely
        String[] parts = (a + " " + b).split(" ");
        a = parts[1];
        b = parts[0];

        System.out.println("\nAfter swapping:\na: " + a + "\nb: " + b);
    }
}
