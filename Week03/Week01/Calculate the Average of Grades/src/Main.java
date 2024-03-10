/* It receives the exam scores of
Mathematics, Physics, Chemistry, Turkish, History and Music courses
from the user and calculates their averages.
If the user's average is greater than 60, it prints "You passed! :)" on the screen,
if it is lower, "You failed! :(" is printed on the screen.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Math grade: ");
        math = input.nextInt();
        System.out.print("Enter your Physics grade: ");
        physics = input.nextInt();
        System.out.print("Enter your Chemistry grade: ");
        chemistry = input.nextInt();
        System.out.print("Enter your Turkish grade: ");
        turkish = input.nextInt();
        System.out.print("Enter your History grade: ");
        history = input.nextInt();
        System.out.print("Enter your Music grade: ");
        music = input.nextInt();

        average = (math + physics + chemistry + turkish + history + music) / 6;
        System.out.print(average > 60 ? "You passed! :)" : "You failed! :(");
        input.close();
    }

}