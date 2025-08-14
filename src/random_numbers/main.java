package random_numbers;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int dice1;
        int dice2;
        int dice3;

        String answer;

        dice1 = random.nextInt(0, 7);
        dice2 = random.nextInt(0, 7);
        dice3 = random.nextInt(0, 7);

        System.out.println("Do you wanna roll 3 dices? ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes"))
        {
            int Total = dice1 + dice2 + dice3;

            if (dice1 >= dice2 && dice1 >= dice3) {
                System.out.println("The highest number was " + dice1);
            } else if (dice2 >= dice3) {
                System.out.println("The highest number was " + dice2);
            } else {
                System.out.println("The highest number was " + dice3);
            }
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);

            System.out.println("Total: " + Total);
        }
        else if (answer.equalsIgnoreCase("no")) {
            System.out.println("You are boring!");
        }
    }
}
