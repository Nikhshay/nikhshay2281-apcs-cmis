package ClassDesign4;

public class YourObject
{
    private String teamname;
    private String captain;
    private double marketValue;
    
    public YourObject()
    {
        teamname = "Manchester United";
        captain = "Wayn Rooney";
        marketValue = 3.05;
    }
    
    public YourObject( String teamname, String captain, double marketValue )
    {
        this.teamname = teamname;
        this.captain = captain;
        this.marketValue = marketValue;
    }
   
    public String toString()
    {
        String output = new String();
        output = "Sport team \n" + "Team name: " + teamname + 
                 "\nCaptain: " + captain +
                 "\nThe Market Value: $" + 
                   marketValue + " billion" + "\n\n";
        return output;
    }
    
    
}