package PlanetTest;

public class Planet
{
    private int maxPopulation;
    private double nameNum;
    private int nameName;
    private int population;
    private double percentSpaceMarines;
    private int SpaceMarines;
    private int maxSpaceMarinesPerStarDestroyer;
    private int StarDestroyers;
    private double SpaceMarinesperstardestroyer;
    private double radius;
    
    public Planet()
    {
       nameNum = ((double) Math.random());
       radius = ((double) Math.random());
       maxPopulation = 1; 
       percentSpaceMarines = 1.00;
       population = 1;
       SpaceMarines = 1;
       StarDestroyers = 1;
       SpaceMarinesperstardestroyer = 1.00;
    }
    
     Planet( int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer )
    {
        this.maxPopulation = maxPopulation;
        this.percentSpaceMarines = percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
        population = ((int) (Math.random()*100000000));
        SpaceMarines = ((int) this.percentSpaceMarines * ((int) (population))); //comes out at 0 so SpaceMarinesperstardestroyer becomes 0 
        StarDestroyers = ((int) (Math.random()*20000));
        SpaceMarinesperstardestroyer = SpaceMarines/StarDestroyers;
        nameNum = ((double) Math.random());
        radius = ((double) Math.random());
        }
        
    public String toString()
    {
        String output = new String();
        output = "Name: " + String.format("%.2f", nameNum) +
                 "\nRelationship: " + 
                 "\nRadius: " + String.format("%.2f", radius) +
                 "\nPopulation: " + population +
                 "\nSpace Marines as percent of Pop.: " + String.format("%.2f",percentSpaceMarines) +
                 "\nSpace Marines: " + SpaceMarines +
                 "\nStar Destroyers: " + StarDestroyers +
                 "\nSpace Marines per star destroyer: " + SpaceMarinesperstardestroyer + "\n\n";
        return output;
    }
    
    
}