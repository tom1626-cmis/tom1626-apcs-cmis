
/**
 * Write a description of class Swapper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swapper
{
    public static void main(String[] args)
    {
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        for(int row =0; row<grid.length;row++)
        {
            for(int col = 0; col < grid[0].length ; col++)
            {
                System.out.print(grid[row][col] + "  ");
            }
            System.out.print("\n");
        }
        //finding index
        int[] rowPro = new int[10];
        int[] colPro = new int[10];
        int maxrow =0;
        int rowindex = 0;
        int maxcol =0;
        int colindex=0;
        for(int i = 0; i< 10; i ++)
        {
            rowPro[i] = 1;
            colPro[i] = 1;
        }
        for(int row =0; row<grid.length;row++)
        {
            for(int col = 0; col < grid[0].length ; col++)
            {
                if(grid[row][col] != 0)
                {
                    rowPro[row] *= grid[row][col];
                    colPro[col] *= grid[row][col];
                }
            }
        }
        for(int i = 0; i< 10; i ++)
        {
            if(rowPro[i]<1000)
            {
                System.out.println("Product of row " + (i+1) + " : " + rowPro[i] +"\t\tProduct of column "+(i+1)+" : " +colPro[i]);
            }
            else
            {
                System.out.println("Product of row " + (i+1) + " : " + rowPro[i] +"\tProduct of column "+(i+1)+" : " +colPro[i]);
            }
            if (rowPro[i] > maxrow)
            {
                maxrow = rowPro[i];
                rowindex = i;
            }
            if (colPro[i] > maxcol)
            {
                maxcol = colPro[i];
                colindex = i;
            }
        }
        System.out.println(grid[rowindex][colindex]);
        //replace
        System.out.println("---------------");
        System.out.println("Replaced");
        System.out.println("---------------");
        for(int row =0; row<grid.length;row++)
        {
            for(int col = 0; col < grid[0].length ; col++)
            {
                if(grid[row][col]==0)
                {
                    grid[row][col] = grid[rowindex][colindex];
                }
                else if(grid[row][col]==grid[rowindex][colindex])
                {
                    grid[row][col] =0;
                }
                System.out.print(grid[row][col] + "  ");
            }
            System.out.print("\n");
        }
    }
}