import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 0;
        int sum = 0;
        for (int i = 0; i < n ; i++) {
           int littersOfWater = Integer.parseInt(scanner.next());
            sum += littersOfWater;
            if (sum > 255) {
                capacity += littersOfWater;
                System.out.printf("%nInsufficient capacity!");
                sum -= littersOfWater;
            }
        }
        System.out.printf("%n%d", sum);

    }
}
