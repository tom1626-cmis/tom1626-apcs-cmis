
public class YourObjectDriver
{
    public static void main ( String args[])
    {
        String Name = "S4";
        int GPM = 470;
        double Rating = 94.1;
        YourObject Player1 = new YourObject();
        YourObject Player2 = new YourObject(Name, GPM, Rating);
        System.out.println(Player1 + "\n" + Player2);
    }
}
