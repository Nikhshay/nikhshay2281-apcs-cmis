package Interface2;

public abstract class TV
{
    private boolean tvOn = true;

    public TV()
    {
        tvOn = false;
    }
    
    public boolean getTvOn()
    {
        return tvOn;
    }
    
    public void setTvOn(boolean tvOn)
    {
        this.tvOn = tvOn;
    }
    
    public abstract String tvType();
    
}
