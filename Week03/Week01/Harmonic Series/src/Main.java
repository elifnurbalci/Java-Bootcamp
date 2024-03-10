// Harmonic Series Calculator

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Asks user for number of n
        System.out.print("Enter n: ");
        int n = input.nextInt();
        double result = 0;

// Calculate the sum of the harmonic series
        for (int i = 1; i <= n; i++) {
            result += 1.0 / i;
        }
        System.out.println("∑ 1/n Result: " + result);
    }


}