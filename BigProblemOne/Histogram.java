import java.util.Scanner;
import java.util.Random;
public class Histogram
{
    public static void main( String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Type in an integer:");
        int num = input.nextInt();
        int[] random = new int[num];
        int[] occur = new int[100];
        String[] hashtag = new String[100];
        for(int index =0 ; index< num ; index++)
        {
            random[index] = (int)(Math.random()*100);
        } // create random numbers
        for(int index = 0 ; index < 100 ; index ++)
        {
            for(int x = 0; x < num ; x++)
            {
                if (random[x] == index)
                {
                    occur[index] +=1 ;
                }
            }// add to occur
        }  // go through 0-99
        for( int index = 0; index< 100; index++)
        {
            hashtag[index] = "";
            for (int x = 0 ; x< occur[index]; x++)
            {
                hashtag[index] += "#";
            } // create #
        } // go through 0-99
        for( int index = 0 ; index< 100; index ++)
        {
            System.out.println( index + ":" + hashtag[index]);
        } // print
        /// end of randoming and printing histogram
        int min = 0;
        int max = 0;
        for(int index = 0; index < 100; index++)
        {
            if( occur[index] != 0)
            {
                max = index;
            }
        }
        for(int index = 100; index > 0; index--)
        {
            if( occur[index-1] != 0)
            {
                min = index;
            }
        }
        System.out.println("Min = " +(min -1));
        System.out.println("Max = " + max);
        /// end of min + max
        int sum = 0 ;
        double avg = 0;
        for (int index = 0; index< num; index++)
        {
            sum += random[index];
        }
        avg = (double)(sum)/(double)(num);
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
        /// end of sum + avg
        int high = 0;
        for(int index = 0; index < 100 ; index++)
        {
            if ( occur[index] > high)
            {
                high = occur[index];
            }
        }
        System.out.println("Most occurrences of a number = " + high );
        System.out.println("Most occuring number(s) are:");
        for( int x = 0; x<100; x++)
        {
            if( occur[x] == high )
            {
                System.out.print( x + " ");
            }
        }
        /// end of mode
    }
} // end class
