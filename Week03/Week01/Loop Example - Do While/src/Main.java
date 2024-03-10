/* This program that accepts input from the user using Java loops
until a single number is entered, and collects even numbers and
multiples of 4 from the entered values and prints them on the screen. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if ((number % 2 == 0) || (number % 4 == 0)) {
                sum += number;
            }
        }
        while (number % 2 == 0);
        System.out.println("Total: " + sum);
    }


}