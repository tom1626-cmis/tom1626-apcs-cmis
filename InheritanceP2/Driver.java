import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<Television> TVs = new ArrayList<Television>();
        TVs.add(new Television("HD Bronze",59.99));
        TVs.add(new LCD("Silver",99.99));
        TVs.add(new LED("Gold",159.99));
        TVs.add(new DLP("Platinum",259.99));
        TVs.add(new Plasma("Super-Platinum",399.99));
        for(Television e: TVs)
        {
            System.out.println(e);
        }
    }
}