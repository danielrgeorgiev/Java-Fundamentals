    import java.util.Scanner;

    public class PrintAndSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            int sum  = 0;
            for (int  i = number1; i <= number2 ; i++) {
                System.out.print(i + " ");
                sum = sum + i;
            }

            System.out.printf("%nSum: %d", sum);
        }
    }
