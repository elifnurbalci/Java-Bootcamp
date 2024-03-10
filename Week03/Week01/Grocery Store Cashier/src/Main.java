// Grocery Store Cashier Program


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilosPear, kilosApple, kilosTomato, kilosBanana, kilosAubergine;
        double totalPrice, pricePerKiloPear = 2.14, pricePerKiloApple = 3.67, pricePerKiloTomato = 1.11, pricePerKiloBanana = 0.95, pricePerKiloAubergine = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of kilos of Pear: ");
        kilosPear = input.nextInt();
        System.out.print("Enter the number of kilos of Apple: ");
        kilosApple = input.nextInt();
        System.out.print("Enter the number of kilos of Tomato: ");
        kilosTomato = input.nextInt();
        System.out.print("Enter the number of kilos of Banana: ");
        kilosBanana = input.nextInt();
        System.out.print("Enter the number of kilos of Aubergine: ");
        kilosAubergine = input.nextInt();

        totalPrice = (kilosPear * pricePerKiloPear) + (kilosApple * pricePerKiloApple) + (kilosTomato * pricePerKiloTomato) + (kilosBanana * pricePerKiloBanana) + (kilosAubergine * pricePerKiloAubergine);

        System.out.println("Pear: " + kilosPear + "kg");
        System.out.println("Apple: " + kilosApple + "kg");
        System.out.println("Tomato: " + kilosTomato + "kg");
        System.out.println("Banana: " + kilosBanana + "kg");
        System.out.println("Aubergine: " + kilosAubergine + "kg");
        System.out.println("Total price: " + totalPrice + " TL");

        input.close();
    }
}