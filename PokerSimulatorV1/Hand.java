import java.util.Arrays;
/*
 * Hand [0] [1] = 2 Cards
 * Hand [2][3][4][5][6] = Pot
 */
public class Hand
{
    public Card[] Hand = new Card[7];
    int[] score = {0,0,0};
    public Hand(Card[] Deck)
    {
        for(int i = 0; i < Deck.length||i<Hand.length; i ++)
        {
            Hand[i] = Deck[i];
        }

    }

    public int[] Scoring()
    {
        // Hand FOR PAIR //
        boolean pair = false;
        boolean ToK = false;
        boolean FoK = false;
        boolean FH = false;
        boolean TwoP = false;
        int number = 0;
        int secondnumber = 0;
        int score =0;
        for (int i = 0; i < Hand.length ; i++)
        {
            for(int x = i+1 ; x < Hand.length ; x++)
            {
                if ( Hand[i].rank.equals(Hand[x].rank) )
                {
                    pair = true;
                    number = Hand[i].value;
                    for( int t = x+1; t < Hand.length ; t ++)
                    {
                        if(Hand[i].rank.equals(Hand[x].rank) && Hand[x].rank.equals(Hand[t].rank))
                        {
                            ToK = true;
                            for(int  r = t+1; r < Hand.length ; r ++)
                            {
                                if(Hand[i].rank.equals(Hand[x].rank) && Hand[x].rank.equals(Hand[r].rank))
                                {
                                    FoK = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(ToK)
        {
            for(int i = 0; i < Hand.length; i++)
            {
                for(int x = i+1; x < Hand.length; x++)
                {
                    if(Hand[i].value == Hand[x].value && Hand[x].value != number && Hand[i].value != number)
                    {
                        FH = true;
                        secondnumber = Hand[i].value;
                        break;
                    }
                }
            }
        }
        else if(pair)
        {
            for(int i = 0; i < Hand.length; i++)
            {
                for(int x = i+1; x < Hand.length; x++)
                {
                    if(Hand[i].value == Hand[x].value && Hand[x].value != number && Hand[i].value != number)
                    {
                        TwoP = true;
                        secondnumber = Hand[i].value;
                        break;
                    }
                }
            }
        }
        //Hand FOR STRAIGHT//
        boolean Straight = false;
        int[] num = new int[Hand.length];
        for( int i = 0; i < Hand.length; i ++)
        {
            num[i] = Hand[i].value;
            if(Hand[i].rank.equals("J"))
            {
                num[i] = 11;
            }
            else if(Hand[i].rank.equals("Q"))
            {
                num[i] = 12;
            }
            else if(Hand[i].rank.equals("K"))
            {
                num[i] = 13;
            }
            else if(Hand[i].rank.equals("A"))
            {
                num[i] = 14;
            }
        }
        Arrays.sort(num);
        int indexST = 0;
        for(int i = 0; i < num.length-1; i++)
        {
            if(num[i] == num[i+1] -1)
            {
                indexST+=1;
                if(indexST == 4)
                {
                    break;
                }
            }
            else
            {
                indexST = 0;
            }
        }
        if (indexST == 4)
        {
            Straight = true;
        }
        //Hand FOR FLUSH//
        boolean Flush = false;
        int spades = 0;
        int clubs = 0;
        int diamonds =0;
        int hearts = 0;
        for(Card e: Hand)
        {
            if(e.suit == "♠")
            {
                spades+=1;
            }
            if(e.suit == "♥")
            {
                clubs+=1;
            }
            if(e.suit == "♦")
            {
                diamonds +=1;
            }
            if(e.suit == "♣")
            {
                hearts +=1;
            }
        }
        if(spades >=5 || clubs >= 5 || diamonds >= 5 || hearts>=5)
        {
            Flush = true;
        }
        //SCORING SYSTEM//
        if(Straight == true && Flush == true)
        {
            score = 8;
        }
        else if (FoK)
        {
            score =7;
        }
        else if(FH)
        {
            score = 6;
        }
        else if(Flush)
        {
            score =5;
        }
        else if(Straight)
        {
            score = 4;
        }
        else if (ToK)
        {
            score = 3;
        }
        else if (TwoP)
        {
            score = 2;
        }
        else if (pair)
        {
            score = 1;
        }
        else
        {
            score = 0;
        }
        int[] output = new int[3];
        output[0] = score;
        output[1] = number;
        output[2] = secondnumber;
        return output;
    }

    public boolean TestWin(Hand OtherHand)
    {
        int[] HandS = Scoring();
        int[] HandO = OtherHand.Scoring();
        for(int i = 0; i < HandS.length; i++)
        {
            if ( HandS[i] > HandO[i])
            {
                return true;
            }
            else if ( HandS[i] < HandO[i])
            {
                return false;
            }
        }
        return false;
    }
}
