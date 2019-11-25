import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int countOfpeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

         switch (day) {
             case "Friday" :
                 if (typeOfGroup.equals("Students")){
                     totalPrice = countOfpeople * 8.45;
                 } if (typeOfGroup.equals("Business")){
                     totalPrice = countOfpeople * 10.90;
                 } if (typeOfGroup.equals("Regular")){
                     totalPrice = countOfpeople * 15;
             }
                 break;
             case "Saturday" :
                 if (typeOfGroup.equals("Students")){
                     totalPrice = countOfpeople * 9.80;
                 } if (typeOfGroup.equals("Business")){
                 totalPrice = countOfpeople * 15.60;
             } if (typeOfGroup.equals("Regular")){
                 totalPrice = countOfpeople * 20;
             }
                 break;
             case "Sunday" :
                 if (typeOfGroup.equals("Students")){
                     totalPrice = countOfpeople * 10.46;
                 } if (typeOfGroup.equals("Business")){
                 totalPrice = countOfpeople * 16;
             } if (typeOfGroup.equals("Regular")){
                 totalPrice = countOfpeople * 22.50;
             }
                 break;

         }

        if (typeOfGroup.equals("Students") && (countOfpeople >= 30)){
            totalPrice *= 0.85;
        } if (typeOfGroup.equals("Business") && (countOfpeople >= 100)){
            totalPrice = (countOfpeople - 10) * totalPrice;
        } if (typeOfGroup.equals("Regular") && (countOfpeople >= 10) && (countOfpeople <= 20)){
            totalPrice *=  0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
