import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CountWordsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String splitToArray = "The quick brown fox jumps over the lazy dog";

        printCountWords(splitToArray);

}

    private static void printCountWords(@NotNull String splitToArray) {
        String [] words;
        int counter = 0;
        words  = splitToArray.split(" \\+s");
        for (int i = 0; i < words.length; i++) {
            counter += i;
            String word = words[i];

        }
        System.out.println(counter);

    }
}
