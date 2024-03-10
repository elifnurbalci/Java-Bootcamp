// Find leap year or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Ask user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

// Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        } else{
            System.out.println(year + " is not a leap year.");
        }
    }

}