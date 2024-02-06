import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Rock, Paper, Scissors Game");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1-4): ");
            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                continue;
            }

            if (userChoice == 4) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            String[] options = {"Rock", "Paper", "Scissors"};
            int computerChoice = random.nextInt(3) + 1;

            System.out.println("Your choice: " + options[userChoice - 1]);
            System.out.println("Computer's choice: " + options[computerChoice - 1]);

            int result = (userChoice - computerChoice + 3) % 3;

            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println(); // Add a newline for better readability
        }

        scanner.close();
    }
}

