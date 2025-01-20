/**
 *
 * @author Joseph Ayo
 * 1/19/2025
 * Project Assignment M1 - CSD 402
 * Program Function: Recreate the classic game Rock, Paper, Scissors
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create Scanner to request input
        Scanner scanner = new Scanner(System.in);

        // Create random object
        Random random = new Random();

        // Mapping of numbers to choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Generate the computer's choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = random.nextInt(3) + 1;  // Random number between 1 and 3

        // Prompt the user for their choice
        System.out.println("Enter your choice: ");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        int userChoice = scanner.nextInt();

        // Ensure the input is valid
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            return;
        }

        // Display the choices
        System.out.println("Computer's choice: " + choices[computerChoice - 1]);
        System.out.println("Your choice: " + choices[userChoice - 1]);

        // Determine the winner
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((computerChoice == 1 && userChoice == 3) || 
                   (computerChoice == 2 && userChoice == 1) || 
                   (computerChoice == 3 && userChoice == 2)) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("You win!");
        }
        scanner.close();
    }
}