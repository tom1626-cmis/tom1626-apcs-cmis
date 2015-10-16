public class Planet
{
    private int Population;
    private double percentSpaceMarines;
    private double SpaceMarinesPerStarDestroyer;
    private String relationship;
    private double Radius;
    private String name;
    String[] PossibleNames = {"Alpha","Beta","Gamma","Delta"};
    String[] PossibleRelation = {"at war", "hostile", "friendly","neutral"};
    Planet()
    { 
        name = PossibleNames[(int)(Math.random()*4)] + " " +
        String.format("%.2f",Math.random());
        percentSpaceMarines = 1; 
        Population = 1;
        Radius = 1;
        relationship = PossibleRelation[(int)(Math.random()*4)];
        SpaceMarinesPerStarDestroyer = 1;
    }
    Planet( int maxPopulation, double percentSpaceMarines,double maxSpaceMarinesPerStarDestroyer )
    {
        name = PossibleNames[(int)(Math.random()*4)] + " " +
        String.format("%.2f",Math.random());
        this.percentSpaceMarines = percentSpaceMarines;
        Population = (int)(maxPopulation * Math.random());
        Radius = Math.random();
        relationship = PossibleRelation[1];
        SpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer * Math.random();
    }
    public String toString()
    {
        String output = 
        "Name: " + name + "\n" +
        "Relationship: " + relationship  + "\n" +
        "Radius: " + String.format("%.2f",Radius) + "\n" +
        "Population: " + Population + "\n" +
        "Space Marines as percent of Population: " + String.format("%.2f",percentSpaceMarines) + "\n" +
        "Space Marines: " + (int)(Population * percentSpaceMarines)  + "\n" +
        "Star Destroyers: " + (int)((int)(Population * percentSpaceMarines)/(SpaceMarinesPerStarDestroyer))  + "\n" +
        "Space Marines per Star Destroyer: " + String.format("%.2f",SpaceMarinesPerStarDestroyer) + "\n" ;
        return output;
        
    }
}// end class