//Calculates two numbers and prints the result

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Number 2: ");
        int num2 = input.nextInt();

        System.out.print("Please select (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("You cannot divide a number by zero.");
                }
                break;
            default:
                System.out.println("Invalid entry. Please try again.");
        }

        input.close();
    }
}