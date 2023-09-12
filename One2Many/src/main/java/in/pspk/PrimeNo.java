package in.pspk;

public class PrimeNo {

    public static void main(String[] args) {
        int prime = 13;
        int count = 0;
        
        if (prime > 1) {
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("The number is prime");
                System.out.print(prime + " ");
            } else {
                System.out.println("The number is not prime");
            }
        } else {
            System.out.println("The number is not prime");
        }
    }
}
