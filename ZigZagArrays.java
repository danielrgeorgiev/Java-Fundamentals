import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] arrey1 = new String[n];
        String [] arrey2 = new String[n];

        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split(" ");
            if (i % 2 ==0){
                arrey1[i]= input[0];
                arrey2[i]= input[1];
            } else {
                arrey1[i]= input[1];
                arrey2[i]= input[0];
            }
        }
        System.out.println(String.join(" ", arrey1));
        System.out.println(String.join(" ", arrey2));
    }
}
