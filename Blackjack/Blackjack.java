import java.util.Scanner;
public class Blackjack
{
    private static Card RandomCard()
    {
        String[] PossibleCards = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] PossibleSuits = { "♠", "♥", "♦" ,"♣"};
        int RandomNumber = (int)(Math.random()*13);
        int RandomNumberS = (int)(Math.random()*4);
        int value = RandomNumber+1;
        if (RandomNumber > 9)
        {
            value = 10;
        }
        Card Card = new Card(PossibleCards[RandomNumber],PossibleSuits[RandomNumberS],value);
        return Card;
    }
    private static Card[] NewCard(Card[] old)
    {
        Card[] NewArray = new Card[old.length +1];
        for (int i = 0; i < old.length; i++)
        {
            NewArray[i] = old[i];
        }
        NewArray[old.length] = RandomCard();   
        return NewArray;
    }
    private static int CheckScore(Card[] C)
    {
        int score = 0;
        for( Card e: C)
        {
            score += e.value;
            if (e.value == 1 && score <= 10)
            {
                score +=10; 
            }
        }

        System.out.print("Score: " + score + "\n");
        return score;
    }

    private static boolean CheckBust(int S)
    {
        if (S> 21)
        {
            System.out.print("Bust! \n");
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean Blackjack(int S)
    {
        if (S == 21)
        {
            System.out.print("Blackjack!! \n");
            return true;
        }
        else
        {
            return false;
        }
    }

    private static Card[] Hit(Card[] C)
    {
        C = NewCard(C);
        for(Card e: C)
        {
            System.out.print(e + "\t");
        }
        System.out.print("\n");
        return C;
    }

    public static boolean Game()
    {
        Card[] DealerCards = {};
        Card[] YourCards = { RandomCard()};
        System.out.print("Dealer Cards:");
        DealerCards = Hit(DealerCards);
        int DealerScore = 0;
        boolean DealerBust = false;
        boolean DealerBlackJack = false;
        int YourScore = 0 ;
        boolean YourBust = false;
        boolean YourBlackJack = false;
        YourCards = Hit(YourCards);
        YourScore = CheckScore(YourCards);
        boolean win = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Type in 'h' to hit, anything else to stand: ");
        String Choice = input.nextLine();
        while(Choice.equals("h"))
        {

            YourCards = Hit(YourCards);
            YourScore = CheckScore(YourCards);
            YourBust = CheckBust(YourScore);
            YourBlackJack = Blackjack(YourScore);
            if (YourBust == true)
            {
                win = false;
                break;
            }
            if (YourBlackJack == true)
            {
                break;
            }
            System.out.print("Hit or Stand: ");
            Choice = input.nextLine();
        }

        while(DealerScore < 17 && win == true)
        {
            DealerCards = Hit(DealerCards);
            DealerScore = CheckScore(DealerCards);
            DealerBust = CheckBust(DealerScore);
            DealerBlackJack = CheckBust(DealerScore);
            if(DealerScore > YourScore && DealerScore <= 21 && DealerScore > 16)
            {
                win = false;
                break;
            }
            if (DealerBust == true)
            {
                win = true;
                break;
            }
            if (DealerBlackJack == true)
            {
                break;
            }
        }
        if(win == true)
        {
            System.out.println("You win this round!!");
        }
        else
        {
            System.out.println("The dealer won this round...");
        }
        return win;
    }

    public static void main(String args[])
    {
        int Dealermoney = 1000;
        int Yourmoney = 1000;
        while(Dealermoney > 0 && Yourmoney > 0)
        {
            while(Dealermoney > 0 && Yourmoney > 0)
            {
                System.out.println("Your money = " + Yourmoney + "\t Dealer's money = " + Dealermoney); 
                Scanner input = new Scanner(System.in);
                System.out.println("How much money do you want to bet?");
                int moneyBet = input.nextInt();
                if (moneyBet > Yourmoney || moneyBet < 1)
                {
                    System.out.println("It isn't valid!");
                    break;
                }
                else if (moneyBet > Dealermoney)
                {
                    System.out.println("The dealer doesn't have that much money!");
                    break;
                }
                boolean winOrlose = Game();
                if (winOrlose == true)
                {
                    Dealermoney -= moneyBet;
                    Yourmoney += moneyBet;
                }
                else if( winOrlose == false)
                {
                    Dealermoney += moneyBet;
                    Yourmoney -= moneyBet;
                }
            }
        }
        if (Yourmoney == 0)
        {
            System.out.println("You're broke, go home.");
        }
        else if (Dealermoney == 0)
        {
            System.out.println("The dealer's broke, he went home.");
        }
    }
}
