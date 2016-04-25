
/**
 * Write a description of class r here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PairTest
{
    public static int[] Test(int[] test)
    {
        boolean pair = false;
        boolean ToK = false;
        boolean FoK = false;
        int number = 0;
        int score =0;
        for (int i = 0; i < test.length ; i++)
        {
            for(int x = i+1 ; x < test.length ; x++)
            {
                if ( test[i] == test[x] )
                {
                    pair = true;
                    number = test[i];
                    for( int t = x+1; t < test.length ; t ++)
                    {
                        if(test[i] == test[x] && test[x] == test[t])
                        {
                            ToK = true;
                            for(int  r = t+1; r < test.length ; r ++)
                            {
                                if(test[i] == test[x] && test[x] == test[r])
                                {
                                    FoK = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (FoK)
        {
            score =4;
        }
        else if (ToK)
        {
            score = 3;
        }
        else if (pair)
        {
            score = 2;
        }
        else
        {
            score = 1;
        }
        int[] output = new int[2];
        output[0] = score;
        output[1] = number;
        return output;
    }
    public static void main(String[] args)
    {
        int[] test = {1,2,2,4,3,3,5};
        for( int e: test)
        {
            System.out.print( e + "  ");
        }
        System.out.println("\nScore");
        for( int e: Test(test))
        {
            System.out.print( e + "\t");
        }
    }
}