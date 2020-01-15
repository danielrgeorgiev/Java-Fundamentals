import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrey = {1, 2, 3, 4, 5, 6};
        int oddSum = 0;
        int evenSum = 0;
        for (int venodd :arrey) {
            if (venodd % 2 == 0){
                evenSum += venodd;
            } else {
                oddSum += venodd;
            }
        }
        for (int i = 0; i <arrey.length; i++) {

        }
    }
}
