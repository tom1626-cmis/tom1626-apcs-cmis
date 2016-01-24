import javax.swing.JOptionPane;
public class MyPod
{
    private String Color;
    private int Capacity;
    private Song[] songs;
    public MyPod(String Color, int Capacity)
    {
        this.Color = Color;
        this.Capacity = Capacity;
        this.songs = new Song[Capacity];
        for ( int i = 1; i<= Capacity; i++ )
        {
            String name = JOptionPane.showInputDialog("Name"+i+":" );
            int length =Integer.parseInt(JOptionPane.showInputDialog("Length"+i+":"));
            String composer =JOptionPane.showInputDialog("Composer"+i+":");
            songs[i-1] = new Song(name, length, composer);
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
        "Capacity: " + Capacity + "\n" + "--------------------\n Songs" + "\n" +
        "--------------------\n"+
        SongPart;
        return output;
    }
}