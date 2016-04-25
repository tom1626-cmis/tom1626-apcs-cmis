public class Card implements java.io.Serializable
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
    public static Card reverseToString(String X)
    {
        return new Card(X.substring(0,1),X.substring(1));
    }
    public boolean checkSame(Card x)
    {
        if(rank.equals(x.rank) && suit.equals(x.suit))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        String output = rank+suit;
        return output;
    }
}
