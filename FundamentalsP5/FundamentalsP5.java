import java.util.Scanner;
public class FundamentalsP5
{
    public static void main(String args [])
    { 
        String m1, m2, m3, s1, s2, s3;
        Scanner scanner1 = new Scanner (System.in);

        System.out.print("Favorite movie #1:");
        m1 = scanner1.nextLine();

        System.out.print("Favorite movie #2:");
        m2 = scanner1.nextLine();

        System.out.print("Favorite movie #3:");
        m3 = scanner1.nextLine();

        System.out.print("Favorite song #1:");
        s1 = scanner1.nextLine();

        System.out.print("Favorite song #2:");
        s2 = scanner1.nextLine();

        System.out.print("Favorite song #3:");
        s3 = scanner1.nextLine();

        String[] movies = {m1,m2,m3};
        String[] songs = {s1,s2,s3};

        for (String element: movies)
        { System.out.println( element);
        }// end of printing array
        int i = 0;
        while ( i < songs.length)
        { System.out.print( songs[i] + ", ");
            i += 1;
        }// end of printing array
    }// end of main method
}// end of class
