package exam_2;

import java.util.Scanner;

public class PasswordProgram {
    public static void main(String[] args) {
        while (true) {
            String pattern = "([A-Z][a-z]){8}[0-9]";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Password ");
            String password = scanner.nextLine();
            if (password.matches(pattern)) {

                System.out.println("Login Success!");
                break;
            } else {
                System.out.println("Login Failed");
            }
        }
    }
}