import java.util.Scanner;
// By Cade Fujitani
public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        //ask for maximum range
        System.out.println("Whats the maximum range?");
        int range = kb.nextInt();
        // track number of guesses by comp
        int guesses = 0;
        int answer = (int)(Math.random() * range + 1);
        // check if game has been won
        boolean won = false;
        // numer to check if guess is too high or too low
        int result = 0;
        System.out.println("I'm thinking of a number between 1 and " + range);
        // human player
        guessComputer comp = new guessComputer();
        // create a loop to allow player guess until correct
        // System.out.println("What's your guess?");
        while (won == false)
        {
            // gets int from comp
            int guess = comp.play(result, range);
            // check if higher or lower
            if (guess < answer)
            {
                result = -1;
                guesses += 1;
                range = guess;

            }
            else if (guess > answer)
            {
                result = 1;
                guesses += 1;
                range = guess;
            }
            else
            {
                // if guessed then won = true and end game
                won = true;
                guesses += 1;
            }
        }
        System.out.println("The computer guessed the correct number in " + guesses + " guesses!");
    }
}