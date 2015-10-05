public class Song
{
    private String SongName;
    private String Band; 
    private String Year;
    
    public Song()
    {
        SongName = "Maps";
        Band = "Maroon 5";
        Year = "2015";
    }
    public Song( String SongName, String Band, String Year)
    {
        this.SongName = SongName;
        this.Band = Band;
        this.Year = Year;
    }
    public String toString()
    {
        String output = new String();
        output = "Name of Song = " + SongName + "\n" +
                 "Band = " + Band + "\n" +
                 "Year of Release = " + Year;
        return output;
        
    }
    
}
