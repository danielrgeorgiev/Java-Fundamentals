import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  n1 = Integer.parseInt(scanner.nextLine());
        int  n2 = Integer.parseInt(scanner.nextLine());
        int  n3 = Integer.parseInt(scanner.nextLine());
        int cnt = 0;

        for (int i = 1; cnt != 3; i++) {
            if (i  == n1 || i == n2 || i == n3){
                System.out.printf("%n%d", i);
                cnt++;
            }
        }
    }
}
