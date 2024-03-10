// Fibonacci series according to user input

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of your Fibonacci series' length: ");
        int n = input.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;

        if (n<=0) {
            System.out.print("Please enter a positive number");
        }
        while (n>0) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            n--;
        }
    }

}