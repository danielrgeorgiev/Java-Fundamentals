import java.util.Scanner;

public class LeftToTheRightLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long left = 0;
        long right = 0;
        long sum = 0;

        for (int i = 1; i <= n ; i++) {
            left = scanner.nextLong();
            right = scanner.nextLong();

            if (left < right){
                long leftNum = Math.abs(left);
                while (leftNum !=    0){
                    sum += leftNum % 10;
                    leftNum /= 10;
                }
                System.out.println(Math.abs(sum));
            }else {
                long rightNum = Math.abs(right);
                while (rightNum != 0){
                    sum += rightNum % 10;
                    rightNum /= 10;
                }
                System.out.println(Math.abs(sum));
            }
        }
    }
}
