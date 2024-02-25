/* Calculates the average of numbers from 0 to the entered number,
which are divisible by 3 and 4 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();
        int sum = 0, count = 0;
        double average;

// Loop through numbers from 0 to the entered number
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            } else {
                continue;
            }
        }
        average = (double) sum / count;
        System.out.println("The average: " + average);
    }

}