public class Deck
{
    public Card[] Cards = new Card[52];
    String[] Ranks = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
    String[] Suits = { "♠", "♥", "♦" ,"♣"};
    public Deck()
    {
        for(int i = 0 ; i < 52; i++)
        {
            Cards[i] = new Card(Ranks[i%13],Suits[i%4]);
        }
    }

    public Card DealCard() // deal a card to a hand
    {
        while(true)
        {
            int x =(int)( Math.random()*52);
            if( Cards[x] != null)
            {
                Card output = Cards[x];
                Cards[x] = null;
                return output;
            }
        }
    }

    public void reset() // reset whole deck
    {
        for(int i = 0 ; i < 52; i++)
        {
            Cards[i] = new Card(Ranks[i%13],Suits[i%4]);
        }
    }

    public String toString()
    {
        return "This Feature Not Available";
    }
}
