import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String num = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int j = Character.digit(num.charAt(i),10);
            sum += j;
        }
        System.out.println(sum);
    }
}
