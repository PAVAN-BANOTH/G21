package in.pspk;

public class NaturalNoSum {

    public static int sumOfNaturalNo(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = NaturalNoSum.sumOfNaturalNo(n);
        System.out.println("Sum: " + sum);
    }
}
