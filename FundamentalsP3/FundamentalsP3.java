
import java.util.Scanner;
public class FundamentalsP3
{ public static void main(String args[])
   {
       int num;
       
       Scanner scanner1 = new Scanner (System.in);
       
       System.out.print("Type in a whole number:");
       num = scanner1.nextInt();
       if (num % 2==1){
      System.out.print("This number is odd.");
    }
     if (num % 2 ==0){
      System.out.print("This number is even.");
    }
    }
}
