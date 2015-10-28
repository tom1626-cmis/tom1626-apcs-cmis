

public class RandomCard
{
    private static Card RandomC()
    {
        String[] PossibleCards = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] PossibleSuits = { "♠", "♥", "♦" ,"♣"};
        int RandomCardIndex = (int)(Math.random()*13);
        int RandomSuitIndex = (int)(Math.random()*4);
        Card Card = new Card( PossibleCards[RandomCardIndex] , PossibleSuits[RandomSuitIndex]);
        return Card;
    }
    public static void main(String args[])
    {
        Card[] myHand = new Card[3];
        for(int i = 0; i< myHand.length; i++)
        {
            myHand[i] = RandomC();
            System.out.println(myHand[i]);
        }
    }
}
