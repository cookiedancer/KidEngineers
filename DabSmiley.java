import greenfoot.*;

/**
 * this may get used may not
 * 
 * @author Tristan 
 * @version first verison of mr dabbydance
 */
public class DabSmiley extends Actor
{
    private GreenfootImage DabbyDance;
    private GreenfootImage DabbyDance2;
     
    
    public DabSmiley()
    {
        DabbyDance = new GreenfootImage("dabsmiley.jpg");
        DabbyDance2 = new GreenfootImage("dabsmiley2.jpg");
        setImage(DabbyDance);
       
    }
    
    public void act()
    {
        if ( getImage() == DabbyDance )
        {
            Greenfoot.delay(40);
            setImage(DabbyDance2);
        }
        else
        {
            Greenfoot.delay(40);
            setImage(DabbyDance);
        }
    }
}

