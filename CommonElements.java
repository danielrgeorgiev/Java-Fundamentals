import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstRow = scanner.nextLine().split(" ");
        String[] secondRow = scanner.nextLine().split(" ");

        for (String word : firstRow) {
            for (String secondword: secondRow) {
                if (word.equals(secondword)){
                    System.out.print(secondword + " ");
                }
            }
        }

    }
}
