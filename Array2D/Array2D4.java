public class Array2D4
{
    public static void main(String[] args)
    {
        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++)
        {
            alpha[i] = (char)(97+i);

        }
        char[][] table = new char[10][10];
        for(int row =0 ; row<table.length; row++)
        {
            for(int col = 0; col< table[0].length; col++)
            {
                table[row][col] = alpha[((row*table.length)+col)%alpha.length];
                System.out.print(table[row][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}