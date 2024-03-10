//forgot password - create a new password

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);

//ask user to enter username and password

        System.out.print("Please enter your username: ");
        userName = input.nextLine();
        System.out.print("Please enter your password: ");
        password = input.nextLine();

//if username and password are correct, display "Welcome!"

        if (userName.equals("admin") && password.equals("admin123")) {
            System.out.println("Welcome to the system!");
        }

//if username is incorrect, display "Incorrect username..."!

        else if (!userName.equals("admin") && password.equals("admin123")) {
            System.out.println("Incorrect username. Please try again!");
        }

//if password is incorrect, display "Invalid password" message and get a new password!

        else if (userName.equals("admin") && !password.equals("admin123")) {
            System.out.println("Incorrect password.");
            System.out.println("Please enter a new password: ");
            password = input.nextLine();

//When new password is not same as old password as, change it!
            while (password.equals("admin123")) {
                System.out.println("You can't use the same password as before. Please try again!");
                System.out.println("Please enter a new password: ");
                password = input.nextLine();
            }
            System.out.println("Your password has been changed.");
        }

//if username and password are incorrect, display "Invalid username and password."
        else {
            System.out.println("Incorrect username and password.");
        }
        input.close();
    }
}
