public class Hand
{
    Card[] Hand = new Card[7];
    int[] score = new int[3];
    public Hand(Card[] Deck)
    {
        for(int i = 0; i < Deck.length||i<Hand.length; i ++)
        {
            Hand[i] = Deck[i];
        }
    }

    public static int[] Scoring(Card[] test)
    {
        // TEST FOR PAIR //
        boolean pair = false;
        boolean ToK = false;
        boolean FoK = false;
        boolean FH = false;
        boolean TwoP = false;
        int number = 0;
        int secondnumber = 0;
        int score =0;
        for (int i = 0; i < test.length ; i++)
        {
            for(int x = i+1 ; x < test.length ; x++)
            {
                if ( test[i].value == test[x].value )
                {
                    pair = true;
                    number = test[i].value;
                    for( int t = x+1; t < test.length ; t ++)
                    {
                        if(test[i].value == test[x].value && test[x].value == test[t].value)
                        {
                            ToK = true;
                            for(int  r = t+1; r < test.length ; r ++)
                            {
                                if(test[i].value == test[x].value && test[x].value == test[r].value)
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
            for(int i = 0; i < test.length; i++)
            {
                for(int x = i+1; x < test.length; x++)
                {
                    if(test[i].value == test[x].value && test[x].value != number && test[i].value != number)
                    {
                        FH = true;
                        secondnumber = test[i].value;
                        break;
                    }
                }
            }
        }
        else if(pair)
        {
            for(int i = 0; i < test.length; i++)
            {
                for(int x = i+1; x < test.length; x++)
                {
                    if(test[i].value == test[x].value && test[x].value != number && test[i].value != number)
                    {
                        TwoP = true;
                        secondnumber = test[i].value;
                        break;
                    }
                }
            }
        }
        //TEST FOR STRAIGHT//
        boolean Straight = false;
        //TEST FOR FLUSH//
        boolean Flush = false;
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
        for(int i = 0; i < score.length; i++)
        {
            if ( score[i] > OtherHand.score[i])
            {
                return true;
            }
            else if ( score[i] < OtherHand.score[i])
            {
                return false;
            }
        }
        return false;
    }
}
