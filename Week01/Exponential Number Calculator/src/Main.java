//calculates exponents with the values entered by the user using the "For Loop"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, a, result = 1;
        Scanner input = new Scanner(System.in);

//asks user to enter a value for the base and the exponent
        System.out.print("Enter the base: ");
        x = input.nextInt();
        System.out.print("Enter the exponent: ");
        a = input.nextInt();

//calculates the exponents using the "For Loop"
        for (int i =1 ; i <= a; i++) {
            result *= x;
        }
        System.out.println(x + " to the power of " + a + " is " + result);
    }

}