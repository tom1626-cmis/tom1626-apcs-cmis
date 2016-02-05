public class Card
{
    public String rank;
    public String suit;
    public int value;
    public Card(String rank, String suit)
    {
        this.rank = rank;
        this.suit = suit;
        if(rank.equals("J"))
        {
            value = 11;
        }
        else if(rank.equals("Q"))
        {
            value = 12;
        }
        else if(rank.equals("K"))
        {
            value = 13;
        }
        else if(rank.equals("A"))
        {
            value = 14;
        }
        else
        {
            value = Integer.parseInt(rank);
        }
    }
    public String toString()
    {
        String output = rank+suit;
        return output;
    }
}
