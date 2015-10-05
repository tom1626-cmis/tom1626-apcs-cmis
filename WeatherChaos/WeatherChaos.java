import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main(String args[])
    {
        String input = JOptionPane.showInputDialog("How many days?");
        int day = Integer.parseInt(input); 
        int[] temp = new int[day];

        //get input
        if(day <= 0 || day >31)
        {
            System.out.println("This is not a valid amount of days!"); // if invalid
        }
        else
        {
            String description;
            for( int i = 0 ; i < day ; i++)
            {
                temp[i] = (int) (Math.random() * 200) - 100 ;
            } // set integers
            System.out.println("Day \t Temp \t Swing \t Description");
            for(int i = 0 ; i < day ; i++)
            {
                if (temp[i] < 0)
                {
                    description = "freezing";
                }
                else if (temp[i] <= 15)
                {
                    description = "chily";
                }
                else if  ( temp[i] <= 30)
                {
                    description = "comfortable";
                }
                else if ( temp[i] <= 40)
                {
                    description = "hot";
                }
                else
                {
                    description = "normal day in Thailand";
                } // set description
                if ( i == 0 )
                {
                    System.out.println((i+1) + "\t" + temp[i] +  "\t" +  0 + "\t" + description);
                } // there's not temp[-1] so created exception
                else
                {
                    System.out.println((i+1) + "\t" + temp[i] +  "\t" +  Math.abs((temp[i]-temp[i-1]))+ "\t" + description);
                } // normal printing
            }
            //gained data
            int min = 100;
            int minDay = 0;
            for(int i = 0 ; i < day ; i++)
            {
                if ( temp[i] < min)
                {
                    min = temp[i] ;
                    minDay = i+1;
                }
            }
            int max = -100;
            int maxDay = 0;
            for(int i = 0 ; i < day ; i++)
            {
                if ( temp[i] > max)
                {
                    max = temp[i] ;
                    maxDay = i+1;
                }
            }
            int sum = 0;
            for(int element: temp)
            {
                sum += element;
            }
            double avg = (double)sum/(double)day;
            int swing = 0 ;
            int swingD1 = 0;
            int swingD2 = 1;
            for(int i = 1 ; i < day ; i++)
            {
                if ( Math.abs(temp[i] - temp[i-1]) > swing)
                {
                    swing = Math.abs(temp[i] - temp[i-1]);
                    swingD1 = i;
                    swingD2 = i+1;
                }
            }
            //gained avg, min, max , b_swing

            System.out.println("Min temperature: " + min + " degrees on Day " + minDay );
            System.out.println("Max temperature: " + max + " degrees on Day " + maxDay );
            System.out.println("Average temperature: " + avg + " degrees");
            System.out.println("Largest Swing: " + swing+ " on between day " + swingD1 + " and " + swingD2); // print stats
        }
    }
}
