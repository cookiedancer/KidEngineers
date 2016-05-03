import greenfoot.*;

/**
 * This is the back bone of the project.  here we defined the actions that all the important actors can do.
 * also the framework for the text boxes is housed here.
 * * Tristan and Kevin 
 * Version: final
 */
public class CompParts extends Actor
{
    Actor textbox;  //using this guy to display the description
    boolean mouseOn; //if the mouse is over my object or not

    public void setDescription(String text)
    {
        GreenfootImage textImage = new GreenfootImage(text, 28, null, null); 
        int biggerWidth = textImage.getWidth()+20;
        int biggerHeight = textImage.getHeight()+16;
        GreenfootImage image = new GreenfootImage(biggerWidth, biggerHeight); 
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1); 
        int drawX = (image.getWidth()-textImage.getWidth())/2;
        int drawY = (image.getHeight()-textImage.getHeight())/2;
        image.drawImage(textImage, drawX, drawY); 
        textbox = new Noone(); 
        textbox.setImage(image); 
    }    
    /**
     * Act - do whatever the CompParts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    public void act() 
        {//opening act method
            if (getWorld() instanceof LivingRoom && 
                textbox != null && 
                Greenfoot.mouseMoved(null) && 
                mouseOn != Greenfoot.mouseMoved(this)) // is mouse changing between being on and off the actor
                {
                    mouseOn = !mouseOn; // update saved state
                    if (mouseOn) // hover beginning
                    {
                        getWorld().addObject(textbox, getX(), getY()-180); // show textbox
                    }
                    else // hover ending
                    {
                        getWorld().removeObject(textbox); // hide textbox
                    }
            }
            if (getWorld() instanceof LetsBuild) 
                {
                if (Greenfoot.mousePressed(this)) // gets focus
                {
                Greenfoot.playSound("blip.mp3");
                int x = getX();
                int y = getY();
                World world = getWorld();
                world.removeObject(this);
                world.addObject(this, x, y);
                }
                if (Greenfoot.mouseDragged(this)) // is the actor being dragged
                {
                MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY()); // keep actor with mouse
                }
                }
        } 
    //public void clickee()
    {    
    //if (Greenfoot.mouseDragged(this))
        {//opening drag and drop
            
            //World world = getWorld();
            //MouseInfo mi = Greenfoot.getMouseInfo();
            //world.removeObject(this);
           // world.addObject(this, mi.getX(), mi.getY());
            //return;
            

        }//closing drag and drop
    }


}


