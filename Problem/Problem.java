import java.util.Random;
public class Problem
{
    public static void main (String args[])
    {
        int[] array = new int[1000000];
        for (int index = 0; index < array.length ; index++)
        {
            int i = (int)(Math.random()*1000000);
            array[index] = i;
        }
        int x = 0;
        int index = 0;
        for ( int element : array)
        {int number = element;
        
        index++;
        if( number % 3== 0 && number % 5 == 0 && number % 7 == 0 && number % 11 == 0 && x ==0)
        {
            System.out.println("-----------------");
            System.out.println(element);
            System.out.println(index);
            System.out.println("-----------------");
            x++;
        }
        }
    }
}
