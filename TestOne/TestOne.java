import javax.swing.JOptionPane;

public class TestOne
{
    public static void main(String args[])
    {
        String input = JOptionPane.showInputDialog("Type in an integer: "); //input
        int number = Integer.parseInt(input);
        String[] index = new String[number];
        double[] random = new double[number];
        String[] letter = new String[number]; // 3 seperate arrays
        for (int x = 0; x< number; x++)
        {
            index[x] = x + ":";
        } // index number
        for ( int x = 0; x< number; x++)
        {
            random[x] = (Math.random()*49+1);
        } // random number

        for ( int x = 0; x < number; x++)
        {
            System.out.println( index[x] +random[x]);
        } // print first half
                for ( int x = 0 ; x< number; x++)
        {
            letter[x] = ""; // blank string
            if ( (int)random[x] %2 == 0)
            {
                for(int y = 0; y< (int)random[x]; y++)
                {
                    letter[x] += "E";
                }// add letters
            } // end of even
                        if ( (int)random[x] %2 == 1)
            {
                for(int y = 0; y< (int)random[x]; y++)
                {
                    letter[x] += "O";
                } // add letters
            } // end of odd
        } // letters
        int z = number-1;
        while(z >=0)
        {
            System.out.println(index[z] +letter[z] + random[z]);
            z--;
        } // print last half
    } // end method

}// end class