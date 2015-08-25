import java.util.Scanner;
import java.util.Random;
public class FundamentalsP8
{
    public static void main (String args[])
    {
        String[] array = { "Adam Levine", "Eminem", "Some Guy"};
        for( String elements:array)
        {
            System.out.println(elements);
        }
        System.out.println("--------------------");
        int x = (int)(Math.random() * (array.length -1) + 0.5);
        array[x] = "Michael Jackson";
        for( String elements:array)
        {
            System.out.println(elements);
        }
        System.out.println("--------------------");
        while ( true)
        {
            int i = array.length;
            int random = (int)(Math.random() * (i-1) +0.5 );
            if ( array[random] == "Michael Jackson")
            {
                System.out.println("Michael Jackson has been found");
                break;
            }
            else
            {
                System.out.println("No Michael in music[" + random + "]");
                
            }
        }
        
    }
}