import java.util.ArrayList;
public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> YourFamily = new ArrayList<String>();
        YourFamily.add("You");
        YourFamily.add("Your Brother");
        YourFamily.add("Your Dad");
        YourFamily.add("Your Mom");
        for(String e: YourFamily)
        {
            System.out.println(e);
        }
        for(int i = 0; i< YourFamily.size();i ++)
        {
            System.out.println(YourFamily.get(i));
        }
    }
}