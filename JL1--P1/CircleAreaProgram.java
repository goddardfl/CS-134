import java.util.Scanner;
public class CircleAreaProgram
{
     public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );
        
        System.out.println ( "Circle Area Calculator" );
        
        double r, area;
        double pi = 3.14;
        
        System.out.println ( "Circle Area Calculator" );
        
        System.out.print ( "What is the Radius? ");
        r = scanner.nextDouble();
        
        area = pi * Math.pow( r, 2 );
        
        System.out.println ( "Area: " + area );
        
        scanner.close();
    }
}
