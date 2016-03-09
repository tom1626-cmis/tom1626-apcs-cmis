public class LED extends Television
{
    public LED( String initialModel, double initialPrice ) 
    { 
        super("LED " + initialModel, initialPrice);
    } 
    public String toString()
    {
        String output = super.toString();
        return output;
    }
}