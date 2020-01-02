import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char alphabet ;
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            alphabet = scanner.next().charAt(0);
            sum += (int) alphabet;
        }
        System.out.printf("The sum equals: %d", sum);

    }
}
