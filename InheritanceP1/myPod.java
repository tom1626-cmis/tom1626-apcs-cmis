public class myPod extends myDevice
{
    int sizeGB;
    String color;
    public myPod(String color)
    {
        super("Pod",299);
        this.color = color;
    }
    public String toString()
    {
        return super.toString() + "Color: " + color;
    }
}