// find chinese zodiac animal
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// prompt user to enter year
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();
        int animal = year % 12;
        String animalName = "";

// determine animal name
        switch (animal) {
            case 0:
                animalName = "Monkey";
                break;
            case 1:
                animalName = "Rooster";
                break;
            case 2:
                animalName = "Dog";
                break;
            case 3:
                animalName = "Pig";
                break;
            case 4:
                animalName = "Rat";
                break;
            case 5:
                animalName = "Ox";
                break;
            case 6:
                animalName = "Tiger";
                break;
            case 7:
                animalName = "Rabbit";
                break;
            case 8:
                animalName = "Dragon";
                break;
            case 9:
                animalName = "Snake";
                break;
            case 10:
                animalName = "Horse";
                break;
            case 11:
                animalName = "Sheep";
                break;
        }
        System.out.println("Your chinese zodiac animal is " + animalName + " and animal code: " + animal);

        input.close();
    }


}