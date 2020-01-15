import java.util.Arrays;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] word = new int[n];

        for (int i = 0; i < n; i++) {
            String sequence = scanner.nextLine();

            int length = sequence.length();
            int sum = 0;

            for (int j = 0; j <sequence.length() ; j++) {
                char currentChar = sequence.charAt(j);
                if(isVowel(currentChar)){
                    sum +=currentChar * length;
                }else if (isConsanant(currentChar)){
                    sum +=currentChar / length;
                }
                word[i] = sum;
            }
        }
        Arrays.sort(word);

        for (int i : word) {
            System.out.println(i);
        }
    }
    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }
    public static boolean isConsanant(char c) {
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c + "");
    }
}
