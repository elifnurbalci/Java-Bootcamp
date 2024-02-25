//create a diamond shape

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height for your diamond: ");

        int height = input.nextInt();
        int halfHeight = height / 2;

        if (height % 2 == 0 || height <= 1) {
            System.out.println("Invalid height. Height must be an odd number greater than 1.");
            return;
        }
        // Diamond's upper half
        for (int i = 0; i < halfHeight; i++) {
            for (int j = 0; j < halfHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Diamond's middle line
        for (int i = 0; i < height; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Diamond's lower half
        for (int i = halfHeight - 1; i >= 0; i--) {
            for (int j = 0; j < halfHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
