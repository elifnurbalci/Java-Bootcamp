// Finding the sum of the numeric value of number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0, digit;

        while (number != 0) {
// Extract the last digit
            digit = number % 10;
// Finding the number of digit
            number /= 10;
// Add the numeric value of digit to sum
            sum += digit;
        }
        System.out.println(sum);
    }

}