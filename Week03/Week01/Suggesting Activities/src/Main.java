/* Suggesting Activities According to Air Temperature

Conditions:
1- Suggest "Skiing" if the temperature is less than 5 degrees.
2- If the temperature is between 5 and 15 degrees, suggest the "Cinema" activity.
3- If the temperature is between 15 and 25 degrees, suggest the "Picnic" activity.
4- If the temperature is greater than 25 degrees, recommend the "Swimming" activity.

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String activity = "";
        int temp;

// Create a Scanner object to read input from the user
        System.out.print("Please give the temperature: ");
        Scanner input = new Scanner(System.in);
        temp = input.nextInt();

        if (temp < 5) {
            activity = "Skiing";
        } else if (temp <= 15) {
            activity = "Cinema";
        } else if (temp <= 25) {
            activity = "Picnic";
        } else if (temp > 25) {
            activity = "Swimming";
        }
        System.out.println("Based on the temperature, you should go: " + activity);

        input.close();
    }

}