public class Array2D2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int[][] num = new int[3][5];
        for(int row = 0; row< num.length; row++)
        {
            for(int col = 0; col< num[0].length; col++)
            {
               int x = (int)(Math.random()*10);
                num[row][col] = x;
            }
        }
        for(int[] e:num)
        {
            for(int x: e)
            {
                sum += x;
                System.out.print(x + "  ");
            }
            System.out.print("\n");
        }
        int[] Colsum = {0,0,0,0,0};
        int[] rowsum = {0,0,0};
        for(int i = 0; i < num.length; i ++)
        {
            for(int x = 0; x <num[0].length;x++)
            {
                Colsum[x] += num[i][x];
                rowsum[i] += num[i][x];
            }
        }
        System.out.println("SUM: " + sum);
        for(int i=0; i < 5; i++)
        {
            System.out.println("Sum of Column "+ (i+1) + " : " + Colsum[i]);
        }
        for(int i=0; i < 3; i++)
        {
            System.out.println("Sum of Row "+ (i+1) + " : " + rowsum[i]);
        }
    }
}