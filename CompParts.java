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
//private boolean isGrabbed()
//{
//if (Greenfoot.mousePressed(this))
  
//{//opening mousePressed
   // isGrabbed = true;
    
    //World world = getWorld();
   // MouseInfo mi = Greenfoot.getMouseInfo();
   // world.removeObject(this);
   // world.addObject(this, mi.getX(), mi.getY());
   // return;
//} //closing mouse press
//drag object and make it follow the mose
//if ((Greenfoot.mouseDragged(this)) && isGrabbed)
//{// opening mouse drag
    //MouseInfo mi = Greenfoot.getMouseInfo();
    //setLocation(mi.getX(), mi.getY());
   // return;
//}// closing mousedrag
// drop the actor
//if (Greenfoot.mouseDragEnded(this) && isGrabbed)
//{//dropitlikeitshot
    // release the object
   // isGrabbed = false;
    //return;
//}//dropitlikeitshot ending
//}
}


