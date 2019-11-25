import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = games / 2;
        int countMouse = games / 3;
        int countKeyboard = games / 6;
        int countDisplay = games / 12;

        double money = countDisplay * displayPrice + countHeadset * headsetPrice + countMouse * mousePrice
                + countKeyboard * keyboardPrice;


        System.out.printf("Rage expenses: %.2f lv.", money);

    }
}
