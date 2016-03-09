public class myDevice
{
    String type;
    int cost;
    public myDevice(String type, int cost)
    {
        this.type = type;
        this.cost = cost;
    }
    public String toString()
    {
        return "Type: " + type + "\n"+
        "Cost: " + cost + "\n";
    }
}