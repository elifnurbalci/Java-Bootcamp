// getting 3 numbers from users and calculate to (a+b*c-b)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, result;
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b= input.nextInt();
        System.out.print("Enter c: ");
        c= input.nextInt();
        result = a+b*c-b;

        System.out.println("a+b*c-b = " + result);

        input.close();
    }


}