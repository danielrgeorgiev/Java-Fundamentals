import java.sql.Struct;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersInLine = scanner.nextLine();
        String[] numberStrings = numbersInLine.split("");
        //String[] numberStrings = {"2", "8", "30", "25"};

        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(2 * numbers[i]);
        }
    }
}
