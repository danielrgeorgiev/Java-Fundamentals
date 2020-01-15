import java.util.Scanner;

public class MiddleCharOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(printMiddleChar(word));
    }

    private static String printMiddleChar(String word) {
        int position = 0;
        int length = 0;

        if (word.length() % 2 == 0){
            position = word.length() / 2 - 1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }
}
