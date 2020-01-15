import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] imput = scanner.nextLine().split(" ");
        int[] number = new int[imput.length];
        int target = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number.length - 1; i++) {
            int firstNumber = number[i];
            for (int j = i + 1; j < number.length; j++) { // старата позиция  на индекс i
                int secondNumber = number[j];
                if (firstNumber + secondNumber == target) {
                    System.out.printf("%d%d%n", firstNumber, secondNumber);
                }

            }

        }
    }
}
