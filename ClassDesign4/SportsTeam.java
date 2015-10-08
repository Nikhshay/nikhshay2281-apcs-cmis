package ClassDesign4;

public class SportsTeam
{
    private String teamname;
    private int marketValue;
    
    public SportTeam()
    {
        teamname = "Manchester United";
        marketValue = 3.05;
    }
    
    public SportTeam( String teamname, int marketValue )
    {
        this.teamname = teamname;
        this.player = player;
    }
   
    public String toString()
    {
        String output = new String();
        output = "The sport teams " + teamname + "\nThe Market Value for this team is " + 
                   marketValue + "billion";
        return output;
    }
    
    
}