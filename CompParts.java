import greenfoot.*;

/**
 * Write a description of class CompParts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompParts extends Actor
{
    Actor textbox;  //using this guy to display the description
    boolean mouseOn; //if the mouse is over my object or not

    public void setDescription(String text)
    {
        GreenfootImage textImage = new GreenfootImage(text, 28, null, null); // creates imagee with the given text
        int biggerWidth = textImage.getWidth()+20;
        int biggerHeight = textImage.getHeight()+16;
        GreenfootImage image = new GreenfootImage(biggerWidth, biggerHeight); // creates a larger image
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1); // draws frame on larger image
        int drawX = (image.getWidth()-textImage.getWidth())/2;
        int drawY = (image.getHeight()-textImage.getHeight())/2;
        image.drawImage(textImage, drawX, drawY); // draws text image on larger image
        textbox = new Noone(); // creates the textbox actor to show the image
        textbox.setImage(image); // gives image to textbox actor
    }    
    /**
     * Act - do whatever the CompParts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    public void act() 
        {//opening act method
            if (getWorld() instanceof LivingRoom && // for the Here world
            textbox != null && // is there a textbox object to show
            Greenfoot.mouseMoved(null) && // did the mouse move
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
            if (getWorld() instanceof LetsBuild) // for the There world
            {
                if (Greenfoot.mousePressed(this)) // gets focus
                {
                // get location and world actor is in so it can be removed and added back in at the same place
                // (this is undocumented behavior to have dragged object painted over others in the world)
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


