public class Deck
{
    public Card[] Cards = new Card[52];
    String[] Ranks = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
    String[] Suits = { "♠", "♥", "♦" ,"♣"};
    public Deck()
    {
        for(int i = 0 ; i < 52; i++)
        {
            Cards[i] = new Card(Ranks[i/4],Suits[i%4]);
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

    public void remove( String Rank, String Suit)
    {
        Card removing = new Card(Rank,Suit);
        for(int i = 0; i<Cards.length; i++)
        {
            if(Cards[i] != null)
            {
                if( removing.rank.equals(Cards[i].rank) && removing.suit.equals(Cards[i].suit))
                {
                    Cards[i] = null;
                }
            }
        }
    } // working

    public void reset() // reset whole deck
    {
        for(int i = 0 ; i < 52; i++)
        {
            Cards[i] = new Card(Ranks[i/4],Suits[i%4]);
        }
    }

    public String Simulate(Hand One, Hand Two)
    {
        int OneW = 0;
        int TwoW = 0;

        Hand OneA = One;
        Hand TwoA = Two;
        boolean[] OneT = new boolean[7];
        boolean[] TwoT = new boolean[7];
        for(int i = 0; i< 7; i++)
        {
            OneT[i] = OneA.Hand[i] == null;
            TwoT[i] = TwoA.Hand[i] == null;
        }
        int times = 10000;
        Card[] RemoveCards = new Card[9];
        if( One.Hand[0] != null && One.Hand[1] != null && Two.Hand[0] != null && Two.Hand[1] != null)
        {
            if ( One.Hand[0].checkSame(Two.Hand[0]) || One.Hand[0].checkSame(Two.Hand[1]) ||One.Hand[1].checkSame(Two.Hand[0]) ||
            One.Hand[1].checkSame(Two.Hand[1]) ||One.Hand[0].checkSame(One.Hand[1]) ||Two.Hand[0].checkSame(Two.Hand[1]) )
            {
                return "Error: Repeating Cards";
            }
        }
        for(int i = 0; i < One.Hand.length ; i ++)
        {
            RemoveCards[i] = One.Hand[i];
        }
        RemoveCards[7] = Two.Hand[0];
        RemoveCards[8] = Two.Hand[1];
        for(int y =0 ; y < 1000; y++)
        {
            for( Card e: RemoveCards)
            {
                if( e != null)
                {
                    remove(e.rank, e.suit);
                }
            }

            for( int i = 0;i< 2; i ++)
            {
                if(OneA.Hand[i] == null)
                {
                    OneA.Hand[i] = DealCard();
                }
                if(TwoA.Hand[i] == null)
                {
                    TwoA.Hand[i] = DealCard();
                }
            }
            for( int i = 2;i< 7; i ++)
            {
                if(OneA.Hand[i] == null)
                {
                    OneA.Hand[i] = DealCard();
                }
                if(TwoA.Hand[i] == null)
                {
                    TwoA.Hand[i] = OneA.Hand[i];
                }
            }
            if(OneA.TestWin(TwoA))
            {
                OneW++;
            }
            if(TwoA.TestWin(OneA))
            {
                TwoW++;
            }
            for(int i = 0 ; i < 7; i ++)
            {
                if(OneT[i])
                {
                    OneA.Hand[i] = null;
                }
                if(TwoT[i])
                {
                    TwoA.Hand[i] = null;
                }
            }
            reset();
            times--; 
        }
        double OneWP = (double)(OneW)/100;
        double TwoWP = (double)(TwoW)/100;
        double Split = 100 - (double)(OneW+TwoW)/100;
        String output = "One Wins = " + OneWP + "%  Two Wins = " + TwoWP + "%  Split = " + String.format("%.3f", Split)+ "%" ;
        return output;
    }

    public String toString()
    {
        return "This Feature Not Available";
    }
}
