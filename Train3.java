import java.util.Scanner;

public class Train3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] train = new int[n];
        int sum = 0;

        for (int i = 0; i <= train.length; i++) {
            train[i] = scanner.nextInt();
            sum += train[i];
        }
        for (int i = 0; i < train.length; i++) {
            System.out.println(train[i] + " ");
        }
        System.out.println(sum);
    }
}
