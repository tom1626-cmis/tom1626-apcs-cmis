
public class Driver
{
    public static void main(String[] args)
    {
        JukeBox test = new JukeBox();
        System.out.println(test);
        String ratingsongs = test.playSongofRating(3);
        System.out.println(ratingsongs);
        System.out.println(test.randomSong());
    }
}
