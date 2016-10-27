import java.util.Scanner;
public class Program5
{
    public static void program5()
    {
      System.out.println ("Please enter a number between 0 and 5.");
      int choice;
      Scanner scanner = new Scanner (System.in);
      choice = scanner.nextInt();
      do {
          System.out.println ("invalid entry. Try again:");
          choice = scanner.nextInt();
        }
        while (choice < 0 || choice >5);
      System.out.println ("Thanks mate");
    }
}
