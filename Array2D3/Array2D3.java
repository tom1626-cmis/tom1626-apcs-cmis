public class Array2D3
{
    public static void main(String[] args)
    {
        int[][] table = new int[9][9];
        for(int row = 0; row< table.length; row++)
        {
            for(int col = 0 ; col< table[0].length; col++)
            {
                table[row][col] = (row+1)*(col+1);
            }
        }
        for(int i =0 ; i < table.length+1;i++)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        for(int row = 0; row< table.length; row++)
        {
            System.out.print((row+1) + "\t");
            for(int col = 0 ; col< table[0].length; col++)
            {
                System.out.print(table[row][col] + "\t");
            }
            System.out.print("\n");
        }
    }	
}