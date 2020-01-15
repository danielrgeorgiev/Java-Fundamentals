import java.util.Scanner;

public class ComputeTheSumOfTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digits = scanner.nextInt();

        printComputeDigits(digits);
    }

    private static int printComputeDigits(long n) {
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;

    }
}
