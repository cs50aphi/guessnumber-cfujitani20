public class guessComputer
{
    public int play(int result, int guess)
    {
        //set beginning to half the max
        if (result == 0)
        {
            guess /= 2;
        }
        // if guess is too low add one
        else if (result == -1)
        {
            System.out.println("Guess was too low!");
            guess++;
        }
        // if guess is too high subtract one
        else if (result == 1)
        {
            System.out.println("Guess was too high!");
            guess--;
        }
        return guess;
    }
}