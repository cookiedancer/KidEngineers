import greenfoot.*;

/**
 * Write a description of class CompParts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompParts extends Actor
{
    
    /**
     * Act - do whatever the CompParts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
public void act() 
    {//opening act method
    
    } 
public void clickee()
{    
    if (Greenfoot.mouseDragged(this))
        {//opening drag and drop
            
            World world = getWorld();
            MouseInfo mi = Greenfoot.getMouseInfo();
            world.removeObject(this);
            world.addObject(this, mi.getX(), mi.getY());
            return;
            

        }//closing drag and drop
    }   

}


