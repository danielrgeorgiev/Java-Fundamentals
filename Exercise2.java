import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(printAverageOfThree(a, b, c));
    }

    private static double printAverageOfThree(double a, double b, double c) {
        return (a + b + c)/3;
    }
}
