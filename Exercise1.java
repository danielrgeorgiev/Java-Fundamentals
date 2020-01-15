import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(printTheLowest(a,b,c));

    }

    private static int printTheLowest(int a, int b, int c) {

         return Math.min(Math.min(a, b),c);

    }
}
