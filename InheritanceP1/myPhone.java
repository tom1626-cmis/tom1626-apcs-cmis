public class myPhone extends myDevice
{
    int sizeGB;
    public myPhone(int sizeGB)
    {
        super("Phone",349);
        this.sizeGB = sizeGB;
    }
    public String toString()
    {
        return super.toString() + "Memory(GB): " + sizeGB;
    }
}
