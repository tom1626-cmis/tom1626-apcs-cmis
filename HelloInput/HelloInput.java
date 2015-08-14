import java.util.Scanner;  
    public class HelloInput {
        
        public static void main(String[] args) {

            String firstName;
      

            Scanner scanner = new Scanner( System.in);
        

            System.out.print("Enter your name: ");
            firstName = scanner.nextLine();
            
            
            
            
            System.out.print("Hello," + firstName );

        }

    }
