public class Array2D1
{
    public static void main(String[] args)
    {
        int[][] num = new int[4][3];

        for(int row = 0; row< num.length; row++)
        {
            for(int col = 0; col< num[0].length; col++)
            {
                num[row][col] = (int)(Math.random()*10);
                System.out.print( num[row][col] + "  ");

            }
            System.out.print("\n");
        }

        for(int row = 0; row< num.length; row++)
        {
            for(int col = 0; col< num[0].length; col++)
            {
                if( num[row][col]== 5)
                {
                    System.out.println("Row: " +(row+1) + " Column: " + (1+col));
                }
            }
        }
    }
}