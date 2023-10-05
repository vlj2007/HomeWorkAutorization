import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Two Course HomeWork 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        String login = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your password again: ");
        String confirmPassword = scanner.nextLine();
        System.out.println("You login " + login);
        Authorization(login, password, confirmPassword);
    }

    public static void Authorization(String login, String password, String confirmPassword) {
        if (login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            System.out.println("Your login " + login + " correct");
        } else {
            if ((login == null) || (login.length() == 0) || (!login.trim().isEmpty())) {
                System.out.println("You have not entered anything");
                System.out.println(" Your login " + login + " incorrect. Try again.");
            }
        }
    }
}