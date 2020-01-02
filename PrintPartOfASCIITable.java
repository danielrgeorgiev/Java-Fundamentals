import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2; i++) {
            System.out.print((char) i + " ");
        }
    }
}
