import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] numbers = new int[n];

        for (int i = 0; i < n ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.println(numbers[i] + " ");
            System.out.println();
        }


    }
}
