public class TestDeck
{
    public static void main(String[] args)
    {
        Card[] RandomDeck = new Card[51];
        Deck Deck = new Deck();
        Card[] OC = {new Card("A","♠"),null,new Card("5","♥"),new Card("6","♠"),
                new Card("8","♠"),new Card("7","♥"),null};  
        Hand One = new Hand(OC);
        Card[] TC = {new Card("2","♠"),new Card("4","♥"),new Card("5","♥"),new Card("6","♠"),
                new Card("8","♠"),new Card("7","♥"),null}; 
        Hand Two = new Hand(TC);
        for(Card e: One.Hand)
        {
            System.out.print(e + " ");

        }
        System.out.println();
        for(Card e: Two.Hand)
        {
            System.out.print(e + " ");

        }
        System.out.println();
        System.out.println(Deck.Simulate(One,Two));
    }
}