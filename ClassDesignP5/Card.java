
public class Card
{
    private String number;
    private String suit;
    
    public Card()
    {
        number = "J";
        suit = "Spades";
    }
    public Card(String number, String suit )
    {
        this.number = number;
        this.suit= suit;
        
    }
    
    public String toString()
    {
        String Card = number + suit;
        return Card;
    }
}
