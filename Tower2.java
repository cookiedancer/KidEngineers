import greenfoot.*;

/**
 * Write a description of class Tower2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower2 extends Actor
{
    /**
     * Act - do whatever the Tower2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Memory.class) && isTouching(Videocard.class) && isTouching(Harddrive.class) && isTouching(PowerSupply.class) && isTouching(BluerayDrive.class) && isTouching(Motherboard.class) && isTouching(Processor.class)) 
        { 
            Greenfoot.playSound("queen.mp3");
            Greenfoot.delay(50);
            Greenfoot.stop();
        }
    }    
}
