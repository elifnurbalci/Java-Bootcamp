
// Write a program to find the area of a circle with radius and central angle.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int radius, angle;
        double area, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();
        System.out.print("Enter the angle of the sector: ");
        angle = input.nextInt();

        area = (pi * radius * radius * angle) / 360;

        System.out.println("The area of a part of a circle: " + area);

        input.close();
    }

}