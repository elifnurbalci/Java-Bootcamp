// Find EBOB and EKOK of two numbers (Formula: EKOK * EBOB = (n1*n2))

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        int k = 1, l = 1, ebob = 1, ekok = 1;

        if(n1>1 && n2>1) {
            // Find EKOK
            while(l<=n1*n2) {
                if(l%n1==0 && l%n2==0) {
                    ekok = l;
                    break;
                }
                l++;
            }
            // According to n1 and n2, which one is the bigger number
            if (n1>n2) {
                // Find EBOB
                while(k<=n1) {
                    if(n1%k==0 && n2%k==0) {
                        ebob = k;
                    }
                    k++;
                }
            } else if (n2>n1) {
                // Find EBOB
                while(k<=n2) {
                    if(n1%k==0 && n2%k==0) {
                        ebob = k;
                    }
                    k++;
                }
            } else {
                ebob = n1;
                ekok = n2;
            }
            System.out.println("EBOB: " + ebob +"\n"+"EKOK: " + ekok);
        }
    }

}