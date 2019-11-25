import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfbelt = Double.parseDouble(scanner.nextLine());

        double equipment = priceOfLightsabers * (Math.ceil(countOfStudents * 0.1)) + priceOfRobes * countOfStudents
                + priceOfbelt * (countOfStudents);
        System.out.println(equipment);
    }
}
