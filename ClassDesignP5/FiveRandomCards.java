public class FiveRandomCards
{
    public static Card[] CardAddToArray(Card[] Array, Card Element)
    {
        Card[] Output = new Card[Array.length+1];
        for(int i = 0 ; i < Array.length; i ++)
        {
            Output[i] = Array[i];
        }
        Output[Array.length] = Element;
        return Output;
    }
    
        public static int[] IntAddToArray(int[] Array, int Element)
    {
        int[] Output = new int[Array.length+1];
        for(int i = 0 ; i < Array.length; i ++)
        {
            Output[i] = Array[i];
        }
        Output[Array.length] = Element;
        return Output;
    }
    
    public static boolean isIn( int number, int[] array)
    {
        boolean output = false;
        for (int e: array)
        {
            if (number == e)
            {
                output = true;
            }
        }
        return output;
    }

    public static void main (String args[])
    {
        Card[] DeckOfCards = new Card[52];
        String[] Number = { "A", "2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] Suit = { "♠", "♥", "♦" ,"♣"};
        for( int i = 0 ; i < 52; i ++)
        {
            DeckOfCards[i] = new Card( Number[(int)(i/4)], Suit[i%4]);
        }
        int[] NotPossibleNumbers = new int[0];
        for(int i = 0 ; i < 52; i ++)
        {
            NotPossibleNumbers = IntAddToArray(NotPossibleNumbers, -1);
            int index = (int)(Math.random()*52);
            while (isIn(index, NotPossibleNumbers))
            {
                index = (int)(Math.random()*52);
            }
            NotPossibleNumbers[i] = index;
            
            if(i%4 ==3)
            {
                System.out.println(DeckOfCards[index] + "\t");
            }
            else 
            {
                System.out.print(DeckOfCards[index]+ "\t");
            }
        }
        
        
        
        System.out.println("------------");
        Card[] SecondDeck = new Card[0];
        for(int i = 0 ; i < 13; i ++ )
        {

            for( int x= 0; x < 4; x ++)
            {
                SecondDeck =  CardAddToArray(SecondDeck,new Card( Number[i], Suit[x]) );

            }
        }
        for(int i = 0 ; i <SecondDeck.length; i ++)
        {
            if(i%4 ==3)
            {
                System.out.println(SecondDeck[i] + "\t");
            }
            else 
            {
                System.out.print(SecondDeck[i]+ "\t");
            }

        }
    }
}
