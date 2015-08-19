import java.util.Scanner;
public class FundamentalsP2
{
    public static void main ( String[] args){
        int a, b;
        Scanner scanner1 = new Scanner (System.in);
        
        System.out.print("Value of a:");
        a = scanner1.nextInt();
        
        System.out.print("Value of b:");
        b = scanner1.nextInt();
        
        if(a>b)
        { System.out.println("The value of a is " + a + " and it is more than the value of b whose is " + b + ".");
        }
        
        if(a<b)
        { System.out.println("The value of a is " + a + " and it is less than the value of b whose is " + b + ".");
        }
        else
        {System.out.println("The value of a is " + a + " and it is equal to the value of b whose is also " + b + ".");
        }
    }
}

