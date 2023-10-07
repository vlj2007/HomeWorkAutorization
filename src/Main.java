import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Two Course HomeWork 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        String login = scanner.nextLine();
        try {
            authorizationLogin(login);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your password again: ");
        String confirmPassword = scanner.nextLine();

        try {
            authorizationPassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=========Info=============");
        System.out.println("You login :\t" + login);
        System.out.println("You password :\t" + password);
        System.out.println("You confirmPassword :\t" + confirmPassword);
        System.out.println("==========================");
    }

    public static void authorizationLogin(String login) throws WrongLoginException {
        if (login.matches("^[a-zA-Z0-9_]{5,20}$")) {
            System.out.println("Congratulations! Your login correct");
        } else {
            if ((login == null) || (login.length() == 0) || (!login.trim().isEmpty())) {
                throw new WrongLoginException("The password must be from 5 to 20 characters");
            }
            System.out.println(" Your login incorrect. Try again, please.");
        }


    }

    public static void authorizationPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            System.out.println("Congratulations! The password is correct");
        } else {
            if ((password == null) || (password.length() == 0) || (!password.trim().isEmpty()))
                try {
                    throw new WrongPasswordException("You did not enter a password");
                } catch (WrongPasswordException e) {
                    throw new WrongPasswordException("Passport more than 20 characters");
                }
            System.out.println(" Your password incorrect. Try again, please.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The password and password confirmation fields do not match");
        }

    }
}