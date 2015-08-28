import java.util.Scanner;
import java.util.Random;
public class FundamentalsP6{
    public static void main (String args[])
    {
        int num, index;
        Scanner input = new Scanner (System.in);
        
        System.out.println("How many numbers:");
        num = input.nextInt();
        
        int[] array = new int[num];
        index = 0;
        while ( index < num) 
        {
            int random = (int)(Math.random() * 100);
            array[index]=random;
            index +=1;
        } //adding random int
        
        for( int i =0; i < array.length ;i++)
        {
            System.out.print(array[i] + " "); 
            
        } // printing array
    } // end of class
} // end of method