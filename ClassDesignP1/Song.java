public class Song
{
    public String SongName;
    public String Band; 
    private String Year;
    private int length;
    
    public Song()
    {
        SongName = "Maps";
        Band = "Maroon 5";
        Year = "2015";
        length = 211;
    }
    public Song( String SongName, String Band, String Year, int length)
    {
        this.SongName = SongName;
        this.Band = Band;
        this.Year = Year;
        this.length = length;
    }
    public String getYearReleased()
    {
        return Year;
    }
    void setYearReleased(String NewYear)
    {
        Year = NewYear;
    }
    String minSec()
    {
        return (int)(length/60)+":" +(length%60);
    }
    public String toString()
    {
        String output = new String();
        output = "Name of Song = " + SongName + "\n" +
                 "Band = " + Band + "\n" +
                 "Year of Release = " + Year + "\n" +
                 minSec();
        return output;
        
    }
    
}
