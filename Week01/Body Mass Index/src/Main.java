
// Calculate Body Mass Index

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Enter weight in kg: ");
        weight = input.nextDouble();
        System.out.print("Enter height in m: ");
        height = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println("The Body Mass Index (BMI) is: " + bmi);

        input.close();
    }

}