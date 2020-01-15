import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        printTheSmallestNumber(a,b,c);

    }

    private static void printTheSmallestNumber(int a, int b, int c) {
        int low = 0;

            if (a < b && a < c){
                low = a;
            }
            if (b < a && b < c){
                low = b;
            }
            if (c < a && c < b){
                low = c;
            }
        System.out.println(low);
    }


}
