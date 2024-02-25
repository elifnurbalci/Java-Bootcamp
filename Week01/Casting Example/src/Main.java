/* This program first asks the user to enter an integer and a decimal number.
It then converts this integer to a decimal number and prints the results to the screen
by converting this decimal number to an integer.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Asks the user to enter an integer and a decimal number
        System.out.print("Please enter an integer: ");
        int number1 = input.nextInt();
        System.out.print("Please enter a double: ");
        double number2 = input.nextDouble();

// Converts the integer to a decimal number and vise versa

        int number1_2 = (int) number2;
        double number2_1 = number1;
        System.out.println("The double has been changed from : " + number1+ " to " +number2_1);
        System.out.println("The integer has been changed from " +number2+" to "+ number1_2);


    }

}