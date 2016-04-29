import greenfoot.*;

/**
 * tower for then ending.
 * 
 * @author Tristan and Kevin 
 * Version: final
 */
public class Tower2 extends Actor
{   
    private GreenfootImage clapper1;
    private GreenfootImage clapper2;
    /**
     * Act - do whatever the Tower2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (isTouching(Memory.class) && isTouching(Videocard.class) && isTouching(Harddrive.class) && isTouching(PowerSupply.class) && isTouching(BluerayDrive.class) && isTouching(Motherboard.class) && isTouching(Processor.class)) 
        { 
            Greenfoot.delay(20);
            Greenfoot.playSound("queen.mp3");
            //getWorld().addObject(new MrClapper(), 540, 303);
            Greenfoot.delay(200);
            Greenfoot.setWorld(new Ending());
        }
    }    
}
