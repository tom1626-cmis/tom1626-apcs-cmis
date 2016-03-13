import java.util.ArrayList;
public class AnalogDigitalDriver
{
    public static void main(String args[])
    {
        ArrayList<TV> tv = new ArrayList<TV>();
        BWTV B = new BWTV();
        HDTV H = new HDTV();
        tv.add(B);
        tv.add(H);

        for (TV e: tv)
        {
            System.out.println(e);
        }
        for( int i =0 ;i < tv.size(); i++)
        {
            tv.get(i).setTvOn(true);
        }

        for (TV e: tv)
        {
            System.out.println(e);
        }
        System.out.println(B.rotateRabbitEars());
        System.out.println(H.connectHDMI());
    }
}
