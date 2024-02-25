/* Write a program that prints the taximeter amount on the screen
according to the distance traveled (KM). */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double totalAmount, minAmount = 20.0, welcomeAmount = 10.0, perKM = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Please write your travelled distance (km): ");
        km = input.nextInt();

        totalAmount = welcomeAmount + (km * perKM);
        totalAmount = (totalAmount <= minAmount) ? minAmount : totalAmount;
        System.out.println("Your total amount is: " + totalAmount + " TL");

        input.close();

    }

}