// Find perfect number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        if (number > 1) {
            // loop to find the sum of the divisors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            // check if the sum of the divisors is equal to the number
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer greater than 1.");
        }

        input.close();
    }

}