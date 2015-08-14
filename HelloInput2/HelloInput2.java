
import java.util.Scanner;
    public class HelloInput2 
    {
        public static void main(String[] args) {
            String name, Age;
            Scanner scanner1 = new Scanner(System.in);
        
            System.out.print("Type in your name:");
            name = scanner1.nextLine();
        
            System.out.print("How old are you in years? :");
            Age = scanner1.nextLine();
        
            System.out.print("Hello, " + name + "! You are " + Age+  " years old.");
    }  
}