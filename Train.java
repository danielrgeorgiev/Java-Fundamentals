    import java.util.Scanner;

    public class Train {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);;

            int n = scanner.nextInt();
            int [] wagons = new int[n];
            int sum = 0;

            for (int i = 0; i < wagons.length; i++) {
                wagons [i] = scanner.nextInt();
                sum += wagons [i];
            }
            for (int i = 0; i < wagons.length; i++) {
                System.out.print(wagons[i] + " ");

            }
            System.out.printf("%n%d", sum);

        }
    }
