import greenfoot.*;

/**
 * Write a description of class Videocard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Videocard extends CompParts
{
    /**
     * Act - do whatever the Videocard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseDragged(this))
        {//opening drag and drop
            
            World world = getWorld();
            MouseInfo mi = Greenfoot.getMouseInfo();
            world.removeObject(this);
            world.addObject(this, mi.getX(), mi.getY());
            return;
            

        }//closing drag and drop
        //if (Greenfoot.mouseClicked(this))
        {//opening playSound
            //Greenfoot.playSound("ding.wav");
        }//closing playSound
}
}

