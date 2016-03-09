public class LCD extends Television
{
    public LCD( String initialModel, double initialPrice ) 
    { 
        super("LCD " + initialModel, initialPrice);
    } 
    public String toString()
    {
        String output = super.toString();
        return output;
    }
}