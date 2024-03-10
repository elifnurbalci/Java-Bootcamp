/*
Combination Calculator
Formula: C(n,r) = n! / (r! * (n-r)!)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, resultNFactorial=1, resultRFactorial=1, resultNRFactorial=1;
        double resultCombination;

// Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n: ");
        n = input.nextInt();
        System.out.print("Please enter r: ");
        r = input.nextInt();

        if (n >= r) {
// Calculate n!
            for (int i = 1; i <= n; i++) {
                resultNFactorial = resultNFactorial * i;
            }
// Calculate r!
            for(int j = 1; j <= r; j++){
                resultRFactorial = resultRFactorial * j;
            }
// Calculate (n-r)!
            for(int k = 1; k <= (n-r); k++) {
                resultNRFactorial = resultNRFactorial * k;
            }
            // Calculate C(n,r) = n! / (r! * (n-r)!)
            resultCombination = resultNFactorial / (resultRFactorial * resultNRFactorial);
            System.out.println("C(n,r)= " + resultCombination);

        } else {
            System.out.println("Error: n must be greater than or equal to r.");
        }

    }

}