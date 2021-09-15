import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        var randomNumberPicker = new Random();
        var randomNumber = randomNumberPicker.nextInt(10)+1;
        var inputReader = new Scanner(System.in);
        System.out.print("Pick a random number from 1 to 10:");
        var usersNumber = inputReader.nextInt();
        if (randomNumber == usersNumber) {
            System.out.println("You were right, the number was " + randomNumber);
        }
        else {
            System.out.println("Unfortunately " + usersNumber + " was not the right number.");
        }
    }
}
