import java.util.Scanner;
import javax.swing.JOptionPane;
public class CardDriver
{

    private static double round(double number, int places)
    {
        int NumberX = (int)(number * Math.pow(10,places));
        double finalnumber = (double)(NumberX)/Math.pow(10,places);
        return finalnumber;
    }
    /// rounding method
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        //set scanner
        int NumberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players: ")) ;
        int PlayersNoDealer = NumberOfPlayers -1; //not include dealer
        //how many players
        String[] PossibleCards = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] PossibleSuits = { "♠", "♥", "♦" ,"♣"};
        int[] worth = { 1,2,3,4,5,6,7,8,9,10,10,10,10}; 
        // suits + score;
        Card[][] totalPlayerCard = new Card[NumberOfPlayers][];
        int[] scorePlayers = new int[NumberOfPlayers];
        String[] PlayerName = new String[NumberOfPlayers];
        // arrays
        int bust = 0;
        int blackjack = 0;
        int dealerWins = 0;
        int dealerTies = 0;
        //stats
        PlayerName[0] = "Dealer";
        for( int x = 1; x < NumberOfPlayers; x++)
        {
            PlayerName[x] = "Player" + x;
        }
        //names
        for (int x = 0; x < totalPlayerCard.length; x++)
        {

            Card[] cardsDrawn = new Card[3];
            int score = 0;

            for( int i = 0; i < cardsDrawn.length; i++)
            {
                int CardRandom = (int)(Math.random()*13);
                int SuitsRandom = (int)(Math.random()*4);
                cardsDrawn[i] = new Card(PossibleCards[CardRandom],PossibleSuits[SuitsRandom]); 
                score += worth[CardRandom];
                if (CardRandom == 0 && score <= 10)
                {
                    score += 10;
                }
            }
            scorePlayers[x] = score;

            totalPlayerCard[x] = cardsDrawn;
        }
        // give out cards
        for ( int x = 0; x <NumberOfPlayers; x++)
        {
            System.out.print( PlayerName[x] + "\t" );
            if( x <10)
            {
                System.out.print("\t");
            }
            for (int i = 0; i < 3; i++)
            {
                System.out.print( totalPlayerCard[x][i] + "\t");
            }
            System.out.print("Score:" + scorePlayers[x]);
            if ( scorePlayers[x] >21)
            {
                System.out.println("   Bust!");
                bust +=1 ;
            }
            else if( scorePlayers[x] ==21)
            {
                System.out.println("   BlackJack!!");
                blackjack +=1;
            }
            else
            {
                System.out.println("");
            }
        } 
        // printing out the cards + players
        if (scorePlayers[0] == 21)
        {
            blackjack-=1;
        }
        else if (scorePlayers[0] > 21)
        {
            bust -=1;
        }
        // dealer doesn't count into stats
        System.out.println("-------------");
        System.out.println("The highest winners:");
        int max = 0;
        for( int x = 0; x < NumberOfPlayers; x++ )
        {
            if ( scorePlayers[x] > max && scorePlayers[x] < 22 )
            {
                max = scorePlayers[x];
            }
        }
        for( int x = 1 ; x < NumberOfPlayers; x++)
        {
            if ( scorePlayers[x] == max)
            {
                System.out.println( PlayerName[x] + "\t");
            }
        }
        //find highest winners
        System.out.println("-------------");
        System.out.println("Players who beat the dealer are:");
        for( int x = 1 ; x < NumberOfPlayers; x++)
        {
            if ( (21>= scorePlayers[x] && scorePlayers[x]> scorePlayers[0]) || (scorePlayers[0] >21 && scorePlayers[x] <=21)  )
            {
                System.out.println( PlayerName[x] + "\t");
                dealerWins += 1;
            }
        }
        //people beating the dealers
        if (scorePlayers[0] < 22)
        {
            System.out.println("-------------");
            System.out.println("Players who tied the dealer are:");
            for( int x = 1 ; x < NumberOfPlayers; x++)
            {
                if ( 21>= scorePlayers[x] && scorePlayers[x] == scorePlayers[0]  )
                {
                    System.out.println( PlayerName[x] + "\t");
                    dealerTies += 1;
                }
            }
        }
        // people tieing the dealers if dealer doesn't bust
        System.out.println("Percentage of those who beat the dealers:" + round((100*(double)(dealerWins)/(double)(PlayersNoDealer)),2) +  "%" + "(" + 
            dealerWins + "/"+ PlayersNoDealer+")");
        System.out.println("Percentage of those who tied the dealers:" + round((100*(double)(dealerTies)/(double)(PlayersNoDealer)),2) +  "%" + "(" + 
            dealerTies + "/"+ PlayersNoDealer+")");
        System.out.println("Percentage of blackjacks:" + round((100*(double)(blackjack)/(double)(PlayersNoDealer)),2) +  "%" + "(" + blackjack + "/"+ PlayersNoDealer+")");
        System.out.println("Percentage of busts:" + round((100*(double)(bust)/(double)(PlayersNoDealer)),2) +  "%" + "(" + bust + "/"+ PlayersNoDealer+")");
    } //end method
} //end class
