/*
Calculates flight ticket prices according to distance and conditions. Get Distance (KM), age and trip type (One Way, Round Trip) from the user. Get the price per distance as 0.10 TL / km. First, calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;

Conditions:
The values received from the user must be valid (distance and age values must be positive numbers, trip type must be 1 or 2). Otherwise, the user will be told "You have entered incorrect data!" A warning should be given.
- If the person is under 12 years old, a 50% discount is applied on the ticket price.
- If the person is between the ages of 12-24, a 10% discount is applied to the ticket price.
- If the person is over 65 years old, a 30% discount is applied on the ticket price.
- If the person has selected "Trip Type" round trip, a 20% discount is applied on the ticket price.
*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int age, distance, tripType;
        double price, totalPrice;
        Scanner input = new Scanner(System.in);

// Get the data from the user
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter the distance: ");
        distance = input.nextInt();
        System.out.print("Enter the trip type (1 for one way, 2 for round trip): ");
        tripType = input.nextInt();

// Calculate the price per distance
        if ((age > 0 && distance > 0) && (tripType == 1 || tripType == 2)) {
            price = distance * 0.10;
            totalPrice = price;
            if (age < 12) {
                totalPrice = price * 0.5;
            } else if (age <= 24) {
                totalPrice = price * 0.9;
            } else if (age > 65) {
                totalPrice = price * 0.7;
            }
            if (tripType == 2) {
                totalPrice = totalPrice * 1.2;
            }
            System.out.println("Total price: " + totalPrice +" TL");
        }
        else {
            System.out.println("You have entered incorrect data!");
        }
        input.close();

    }

}