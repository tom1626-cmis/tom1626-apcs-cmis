
import java.util.Scanner;
    public class InputMath {
        public static void main(String[] args)
        { float n1, n2, sum, diff, multi, div, mod, dif, divi, modu;
            Scanner scanner = new Scanner(System.in);
          
            System.out.print("Enter a number: ");
            n1 = scanner.nextFloat();
            
           
            System.out.print("Enter another number: ");
            n2 = scanner.nextFloat();
            
            sum =  n1+n2;
            diff = n1-n2;
            dif = n2-n1;
            multi = n1*n2;
            div=n1/n2;
            divi = n2/n1;
            mod=n1%n2;
            modu = n2%n1;
           
           System.out.println( n1 + " + "  + n2 +" = "+ sum);
           System.out.println( n1 + " - "  + n2 +" = " + diff);     
           System.out.println( n1 + " * "  + n2 +" = " + multi);
           System.out.println( n1 + " / "  + n2 +" = "+ div);
           System.out.println( n1 + " % "  + n2 +" = "+ mod);
            System.out.println( n2 + " + "  + n1 +" = "+ sum);
           System.out.println( n2 + " - "  + n1 +" = " + dif);     
           System.out.println( n2 + " * "  + n1 +" = " + multi);
           System.out.println( n2 + " / "  + n1 +" = "+ divi);
           System.out.println( n2 + " % "  + n1 +" = "+ modu);

        }
    }
          