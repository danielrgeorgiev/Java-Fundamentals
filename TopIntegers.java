import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] imput =  scanner.nextLine().split(" ");
        int [] numbers = new int[imput.length];

        for (int i = 0; i < imput.length; i++) {
            numbers [i] = Integer.parseInt(imput[i]);
        }

            for (int i = 0; i < numbers.length - 1; i++) {
                boolean isBigger = true;
                int currentNumber = numbers[i];
                for (int d = i + 1; d <numbers.length ; d++) {
                    int number = numbers[d];
                    if (currentNumber <= number){
                        isBigger = false;
                        break;
                    }
                }
                if (isBigger){
                    System.out.print(currentNumber + " ");
                }
            }
        System.out.print(numbers[numbers.length-1]);
    }
}
