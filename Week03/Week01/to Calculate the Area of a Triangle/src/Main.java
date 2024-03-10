//Program that calculates the area of a triangle by taking the lengths of three sides from the user

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, perimeter, area;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        a = input.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        b = input.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        c = input.nextInt();

        perimeter = a + b + c;
        u = perimeter / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
            System.out.println("The are of the triangle is: " + area);
        } else {
            System.out.println("The input is invalid. It is not a triangle!");
        }

    }
}