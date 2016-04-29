import greenfoot.*;

/**
 * MrClapper likes to smile and clap!  he's kinda a handsome fella!
 * 
 * Tristan and Kevin 
 * Version: final
 */
public class MrClapper extends Actor
{
    private GreenfootImage clapper1;
    private GreenfootImage clapper2;
    //private GreenfootImage textbox; if more is added after class it will be via a hidden game
    //that will pop out of a letter clicked in a text box (hidden flappy bird game!) 
    
    public MrClapper()
    {
        clapper1 = new GreenfootImage("meclapper1.jpg");
        clapper2 = new GreenfootImage("meclapper2.jpg");
        setImage(clapper1);
       
    }
    
    public void act()
    {
        if ( getImage() == clapper1 )
        {
            Greenfoot.delay(5);
            setImage(clapper2);
        }
        else
        {
            Greenfoot.delay(5);
            setImage(clapper1);
        }
    }
}
//If you made it this far and read this  your dedicated.  hope you enjoyed the project, class was fun!! learned alot!