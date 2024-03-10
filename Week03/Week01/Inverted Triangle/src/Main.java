// create an inverted triangle

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // control n rows
        for (int i = n; i > 0; i--) {
            // control * print
            for (int j=0 ; j < i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();

        }


    }

}