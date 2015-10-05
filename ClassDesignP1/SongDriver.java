
public class SongDriver
{
    public static void main (String args[])
    {
        Song theSong = new Song();
        System.out.println(theSong);
        Song otherSong = new Song( "Lean On", "Major Lazer", "2015");
        System.out.println(otherSong);
    }
}
