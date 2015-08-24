import java.util.Scanner;
import java.util.Random;
public class FundamentalsP7
{
    public static void main(String args[])
    {
        int num,x; 
        int[] array;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Numbers in the array;");
        num = input.nextInt();
        
        array = new int[num];
        for (int index = 0; index< num; index++)
        {
            int firstn = (int)(Math.random() *100);
            double plusminus = Math.random();
           
            if (plusminus>0.5)
            {
                array[index] = -firstn;
            }
            else
            {
                array[index] = firstn;
            }
            
        }
        x =0;
        while (x<array.length)
        {
            System.out.println( array[x]);
            x+=1;
        }
        System.out.println("----------------------------------");
        System.out.println("Positive Integers:");
        for (int index = 0; index<num; index++)
        {
            if(array[index] > 0)
            {
                System.out.println(array[index]);
            }
        }
    }   
}   
