import java.util.ArrayList;
public class myDeviceDriver
{
    public static void main(String[] args)
    {
        ArrayList<myDevice> devices = new ArrayList<myDevice>();
        devices.add(new myPhone(64));
        devices.add(new myWatch(12,23,14));
        devices.add(new myPod("Blue"));
        for( myDevice device: devices)
        {
            System.out.println(device + "\n");
        }
    }
}