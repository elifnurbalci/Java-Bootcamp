// Program that prints the powers of 4 and 5 up to the entered number on the screen

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

// Prints the powers of 4 / 5 up to the entered number
        for (int i = 4; i <= num; i*=4) {
            System.out.println("Result for 4: " +i);
        }
        for (int j = 5; j <= num; j*=5) {
            System.out.println("Result for 5: " +j);
        }

    }

}