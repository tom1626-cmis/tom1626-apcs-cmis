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
        } // end of printing arrays
        System.out.println("--------------------");
        int x = (int)(Math.random() * (array.length -1) + 0.5);
        array[x] = "Michael Jackson";
        for( String elements:array)
        {
            System.out.println(elements);
        } //end of printing array with MJ
        System.out.println("--------------------");
        for ( int index =0; index < array.length; index++)
        {
            if ( array[index] == "Michael Jackson")
            {
                System.out.println("Michael Jackson has been found");
                break;
            } // end if mj is found
            else
            {
                System.out.println("Michael Jackson not found in music[" + index +"]");
            }// saying mj isn't found
        }// end of finding mj

    } //end of method
} // end of class
