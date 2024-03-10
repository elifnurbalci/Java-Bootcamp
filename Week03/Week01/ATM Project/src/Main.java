//An ATM project that allows you to manage your bank account

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        userName = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();
        int balance = 30000;

        int wrong = 0; //according to the instructions, the user has 3 attempts to enter the correct password



//while loop to check if the password is correct
        while (wrong < 3) {

            //if statement to check if the password is correct
            if (userName.equals("admin") && password.equals("admin123")) {
                System.out.println("Welcome on Board!");
                System.out.println("Please choose your option:" + "\n" + "1. Deposit" + "\n" + "2. Withdraw" + "\n" + "3. Check Balance" +"\n" + "4. Exit");

                //switch statement to check the user's choice
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter the amount you want to deposit: ");
                        int deposit = input.nextInt();
                        balance += deposit;
                        System.out.print("Your new balance is: " + balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to withdraw: ");
                        int withdraw = input.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance");
                        } else {
                            balance -= withdraw;
                            System.out.print("Your new balance is: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Your balance is: " + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using our banking system! \n" + "Have a nice day!");
                        break;
                }
                break;
            }
            //if the password is wrong, the user is prompted to enter the correct password
            else {
                System.out.println("Incorrect username or password");
                System.out.print("Enter your username: ");
                userName = input.nextLine();
                System.out.print("Enter your password: ");
                password = input.nextLine();
                wrong++;
            }
        }
        // if the user has entered the wrong password 3 times, the program ends
        if (wrong == 3) {
            System.out.println("You have reached the maximum number of attempts. Your account has been blocked! Please contact us.");
        }

        input.close();
    }


}