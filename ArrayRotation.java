import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrey =  scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number % arrey.length; i++) {
           String firstnum = arrey[0];
            for (int k = 0; k < arrey.length - 1; k++) {
                arrey[k] = arrey[k + 1];
            }
            arrey[arrey.length - 1] = firstnum;
        }
        System.out.print(String.join(" ",arrey));
    }
}
