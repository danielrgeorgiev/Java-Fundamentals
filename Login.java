import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass = "";
        for (int index = username.length() - 1; index >= 0 ; index--) {
            pass += username.charAt(index);
        }
        String entry = scanner.nextLine();
        int counter = 1;
        while (!entry.equals(pass) && counter < 4){
            System.out.println("Incorrect password. Try again.");
            entry = scanner.nextLine();
            counter++;
        }
        if (entry.equals(pass)){
            System.out.printf("User %s is logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
