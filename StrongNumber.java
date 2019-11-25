import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length() ; i++) {
            int digit = Character.getNumericValue(input.charAt(i));

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum += fact;
        }

        if (sum == Integer.parseInt(input)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
