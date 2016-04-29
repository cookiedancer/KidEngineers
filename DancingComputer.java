import greenfoot.*;

/**
 * I am a dancing fool sir/maama.  play me and i shake like a quake.
 * 
 * @author Tristan and Kevin
 * @version: final
 */
public class DancingComputer extends Actor
{  
    private GreenfootImage dancer1;
    private GreenfootImage dancer2;
    private GreenfootImage dancer3;
    
    public DancingComputer()
    {
        dancer1 = new GreenfootImage("new1.JPG");
        dancer2 = new GreenfootImage("new2.JPG");
        dancer3 = new GreenfootImage("new3.JPG");
        setImage(dancer1);
    }
    public void act() 
    {
        danceSon();
    }  
    public void danceSon()
    {
        
        if ( getImage() == dancer1)
        {
            setImage(dancer2);
            Greenfoot.delay(10);
        }         
        if ( getImage() == dancer2)
        {
            setImage(dancer3);
            Greenfoot.delay(10);
        }         
        if ( getImage() == dancer3)
        {
            setImage(dancer1);
            Greenfoot.delay(10);
        }
    }
}
