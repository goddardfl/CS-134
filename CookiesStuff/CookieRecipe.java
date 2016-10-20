import java.util.Scanner;
public class CookieRecipe
{
    
    public static void main (String args[])
    {
        Scanner scanner = new Scanner ( System.in);
        System.out.println ( "How many Batches? ");
        double batches = scanner.nextDouble();
        double teaspoonsOfBakingSoda = 1.0 * batches;
        double teaspoonsOfBakingPowder = 0.5 * batches;
        double cupsOfButter = 1.0 * batches;
        double cupsOfWhiteSugar = 1.5 * batches;
        double amountOfEggs = 1.0 * batches;
        
        System.out.println ( "Cookie Recipe");
        System.out.println ( teaspoonsOfBakingSoda + " tsp baking soda");
        System.out.println ( teaspoonsOfBakingPowder + " tsp baking powder");
        System.out.println ( cupsOfButter + " c butter");
        System.out.println ( cupsOfWhiteSugar + " c white sugar");
        System.out.println ( amountOfEggs + " egg");
        
        scanner.close();
    }
}
