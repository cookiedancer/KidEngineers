import greenfoot.*;

/**
 * Write a description of class KevClapper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KevClapper extends Actor
{
    private GreenfootImage kevclapper1;
    private GreenfootImage kevclapper2;
    //private GreenfootImage textbox; if more is added after class it will be via a hidden game
    //that will pop out of a letter clicked in a text box (hidden flappy bird game!) 
    
    public KevClapper()
    {
        kevclapper1 = new GreenfootImage("kevclapper1.jpg");
        kevclapper2 = new GreenfootImage("kevclapper2.jpg");
        setImage(kevclapper1);
       
    }
    
    public void act()
    {
        if ( getImage() == kevclapper1 )
        {
            Greenfoot.delay(20);
            setImage(kevclapper2);
        }
        else
        {
            Greenfoot.delay(20);
            setImage(kevclapper1);
        }
    }
}
