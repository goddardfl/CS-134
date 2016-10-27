import java.util.Scanner;
public class Program4
{
    
    public static void program4()
    {
        int secretNumber = 24;
        int playerGuess;
        Scanner scanner = new Scanner (System.in);
        do
        {
            System.out.println("Guess the Number?");
            playerGuess = scanner.nextInt();
            if (playerGuess < secretNumber)
            {
                System.out.println("too low!");
            }
            if (playerGuess > secretNumber)
            {
                System.out.println ("too high");
            }
            
        } while (playerGuess != secretNumber);
        System.out.println("Correct");
    }
}
