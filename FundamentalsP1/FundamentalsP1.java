import java.util.Scanner;
public class FundamentalsP1{
    public static void main (String[] args)
    { String food, movie, color, group;
      Scanner scanner1 = new Scanner(System.in);
      
      System.out.print("Favorite color:");
      color = scanner1.nextLine();
      System.out.print("Favorite food:");
      food = scanner1.nextLine();
      System.out.print("Favorite musical group:");
      group = scanner1.nextLine();
      System.out.print("Favorite movie:");
      movie = scanner1.nextLine();
      
      System.out.println("Favorite color is: " + color);
      System.out.println("Favorite food is: " + food);
      System.out.println("Favorite group is: " + group);
      System.out.println("Favorite movie is: " + movie);
    }
}
       