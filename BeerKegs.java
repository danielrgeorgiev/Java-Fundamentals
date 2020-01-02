import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxV = 0.0;
        String maxModel = "";

        for (int i = 0; i < n ; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius  * (double) height;

            if (volume > maxV){
                maxV = volume;
                maxModel = model;
            }

        }

        System.out.println(maxModel);
    }
}
