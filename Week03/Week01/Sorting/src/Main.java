// Sorts 3 numbers getting from the user

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// get 3 inputs from user
        System.out.print("Enter first numbers: ");
        int num1 = input.nextInt();
        System.out.print("Enter second numbers: ");
        int num2 = input.nextInt();
        System.out.print("Enter third numbers: ");
        int num3 = input.nextInt();
        input.close();

// sorts the numbers
        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " < " + num2 + " < " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " < " + num3 + " < " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " < " + num1 + " < " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + " < " + num3 + " < " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + " < " + num1 + " < " + num2);
        } else {
            System.out.println(num3 + " < " + num2 + " < " + num1);
        }
    }

}