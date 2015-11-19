
public class Card
{
    private String Number;
    private String suit;
    public int value;
    
    public Card(String Number,String suit, int value)
    {
        this.suit = suit;
        this.Number= Number;
        this.value = value;
    }
    public String toString()
    {
        String Card = Number+suit;
        return Card;
    }
}
