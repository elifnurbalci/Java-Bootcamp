/* Average calculation according to courses taken.
  Lessons: Mathematics, Physics, Turkish, Chemistry, Music
  Passing Score: 55
  If the course grades entered are not between 0 and 100, they are not included in the average.
  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, turkish, chemistry, music, average, count=0;

        Scanner input = new Scanner(System.in);

// Getting the grades from the user.
        System.out.print("Enter your Math grade: ");
        math = input.nextInt();
        System.out.print("Enter your Physics grade: ");
        physics = input.nextInt();
        System.out.print("Enter your Turkish grade: ");
        turkish = input.nextInt();
        System.out.print("Enter your Chemistry grade: ");
        chemistry = input.nextInt();
        System.out.print("Enter your Music grade: ");
        music = input.nextInt();

// If the grade is between 0 and 100, it is included in the average using count.
// else the grade is not between 0 and 100, it is not included in the average and the count is not increased and the average is not calculated - set to 0.

        if (math >= 0 && math <= 100){
            count++;
        } else {
            math = 0;
        }
        if (physics >= 0 && physics <= 100) {
            count++;
        } else {
            physics = 0;
        }
        if (turkish >= 0 && turkish <= 100) {
            count++;
        } else {
            turkish = 0;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            count++;
        } else {
            chemistry = 0;
        }
        if (music >= 0 && music <= 100) {
            count++;
        } else {
            music = 0;
        }

// Calculating the average
        if (count != 0) {
            average = (math + physics + turkish + chemistry + music) / count;
            System.out.println("Your average is: " + average);

// According to the average, write a message.
            if (average >= 55) {
                System.out.println("You passed the course.");
            } else {
                System.out.println("You failed the course.");
            }
        } else {
            System.out.println("You have entered invalid grades. Please try again.");
        }
        input.close();
    }

}