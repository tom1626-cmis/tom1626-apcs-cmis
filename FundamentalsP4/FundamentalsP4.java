import java.util.Scanner;
import java.util.Random;

public class FundamentalsP4
{ public static void main(String args [])
    {
        int num, sq, random, num1, num2;
        Scanner scanner1 = new Scanner (System.in);

        System.out.print("Type in a whole number");
        num = scanner1.nextInt();
        num1 = num-1;
        while ( true && num1 > -1)
        {
            num2 = num-num1;
            sq = num2 * num2;
            random = (int)(Math.random()*(sq-num2)) + num2;
            System.out.println( num2 + "   " + sq + "   " +random);

            num1 = num1 - 1;
        } // end of printing loop

    } // end of method
} // end of class
