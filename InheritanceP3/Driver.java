import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> Super = new ArrayList<SuperHero>();
        SuperHero[][] caped = new SuperHero[3][3];
        Super.add(new AsteroidMan("Red"));
        Super.add(new AsteroidMan("Blue"));
        Super.add(new FriedEggMan("Green"));
        Super.add(new FriedEggMan("Yellow"));
        Super.add(new LazyMan("Black"));
        Super.add(new LazyMan("White"));
        System.out.println("Printing all superheroes:");
        for( SuperHero e: Super)
        {
            System.out.println(e);
        }

        for(int row = 0; row< caped.length; row++)
        {
            for(int col = 0; col< caped[0].length; col++)
            {

                if( caped[row][col] == null)
                {
                    for( SuperHero e: Super)
                    {

                        if ( e.isCaped())
                        {
                            Super.remove(e);
                            caped[row][col] = e;
                            break;
                        }
                    }
                }
            }
        }


        System.out.println("\n2D Array of Caped");
        for(int row = 0; row< caped.length; row++)
        {
            for(int col = 0; col< caped[0].length; col++)
            {
                if(caped[row][col] != null)
                {
                    System.out.print(caped[row][col].getClass().getSimpleName() + "\t");
                }
                else
                {
                    System.out.print(caped[row][col] + "\t");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\nNon Caped");
        for( SuperHero e: Super)
        {
            System.out.println(e);
        }
        System.out.println("\nCaped");
        for(int row = 0; row< caped.length; row++)
        {
            for(int col = 0; col< caped[0].length; col++)
            {
                if( caped[row][col] != null)
                {
                    System.out.println(caped[row][col]);
                }
            }
        }
    }
}