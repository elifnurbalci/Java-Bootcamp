// Find min and max number from getting input from user


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int numberofInput = input.nextInt();

        // Initialize min and max
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i=1; i<=numberofInput; i++) {
            System.out.print("Enter "+i+"."+ "number: ");
            int number = input.nextInt();
            // Update min and max
            if (i==1) {
                min = number;
                max = number;
            } else if (number <= min) {
                min = number;
            } else if (number >= max) {
                max = number;
            }
        }

        System.out.println("Min: "+min+", Max: "+max);
        input.close();
    }

}