import java.util.Scanner;

public class HumanPlayer
{
    // new scanner
    Scanner kb = new Scanner(System.in);
    public int play(int result)
    {
        // tell player reult of last guess if high state too high if low state low
        if (result == -1)
        {
            System.out.println("Too low!");
        }
        if (result == 1)
        {
            System.out.println("Too high!");
        }
        // ask for a new guess
        int humanGuess = kb.nextInt();
        return humanGuess;
    }
}