/* If the amount entered is between 0 and 1000 TL,
write a program that calculates the VAT amount as 18%,
and if the amount is greater than 1000 TL, the VAT rate is 8% */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int amount;
        float tax1 = 0.18F;
        float tax2 = 0.08F;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = input.nextInt();

        System.out.println("Amount without VAT: "+ amount);

        if (amount > 0 && amount < 1000) {
            System.out.println("Amount with VAT: " + amount * tax1 + " TL");
            System.out.println("VAT is: "+ tax1 +" TL");
        } else if (amount > 1000) {
            System.out.println("Amount with VAT: " + amount * tax2 + " TL");
            System.out.println("VAT is: "+ tax2 +" TL");
        } else {
            System.out.println("Undefined amount");
        }

        input.close();
    }
}