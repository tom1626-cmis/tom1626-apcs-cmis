
public class testhand
{

    public static void main(String[] args)
    {

        String[] Ranks = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] Suits = { "♠", "♥", "♦" ,"♣"};
        Card[] x = new Card[7];
        for( int i = 0 ; i < x.length; i ++)
        {
            x[i] = new Card(Ranks[(int)(Math.random()*13)],Suits[(int)(Math.random()*4)]);
            System.out.println(x[i]);
        }
        Hand Handx = new Hand(x);
        for(Card e: Handx.Hand)
        {
            System.out.print(e + " ");

        }
        for(int i = 0; i < 3; i ++)
        {
            System.out.print(Handx.score[i]);
        }
    }
}
