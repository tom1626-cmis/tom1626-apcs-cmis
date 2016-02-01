import javax.swing.JOptionPane;
import java.util.ArrayList;
public class MyPod2
{
    private String Color;
    private ArrayList<Song> songs = new ArrayList<Song>();
    public MyPod2(String Color)
    {
        this.Color = Color;
        for ( int i = 1; i<= 3; i++ )
        {
            String name = JOptionPane.showInputDialog("Name"+i+":" );
            int length =Integer.parseInt(JOptionPane.showInputDialog("Length"+i+":"));
            String composer =JOptionPane.showInputDialog("Composer"+i+":");
            songs.add(new Song(name, length, composer));
        }

    }

    public String toString()
    {
        String SongPart = "";
        for (Song e: songs)
        {
            SongPart += "\n" + e;
        }
        String output = "Color: " + Color + "\n" +
            "--------------------\n Songs" + "\n" +
            "--------------------\n"+
            SongPart;
        return output;
    }
}