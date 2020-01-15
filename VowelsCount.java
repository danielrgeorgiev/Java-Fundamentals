import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        countOfvowels(word);
    }

    private static void countOfvowels(String word) {
        int count = 0;
        for (char i = 0; i < word.length(); i++) {

            if (Character.toLowerCase(word.charAt(i)) == 'a' || Character.toLowerCase(word.charAt(i)) == 'o' ||
                    Character.toLowerCase(word.charAt(i)) == 'i' ||
                    Character.toLowerCase(word.charAt(i)) == 'u' || Character.toLowerCase(word.charAt(i)) == 'e'){
                count++;
            }
        }
        System.out.println(count);

    }
}
