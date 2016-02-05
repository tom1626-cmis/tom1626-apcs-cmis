public class TestDeck
{
    public static void main(String[] args)
    {
        Card[] RandomDeck = new Card[52];
        Deck Deck = new Deck();
        for(Card e: RandomDeck)
        {
            e = Deck.DealCard();
            System.out.println (e);
        }
    }
}