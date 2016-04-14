import greenfoot.*;

/**
 * Write a description of class backSplashscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backSplashscreen extends World
{

    /**
     * Constructor for objects of class backSplashscreen.
     * 
     */
    public backSplashscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
    }
    public void act()
    {
        beginGame();
        
        //if (Greenfoot.mouseClicked(this))
        //{
            //("press enter to continue", 100, 100);
            //Greenfoot.playSound("ding.wav");
        //}
    }
    
    void beginGame()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new LivingRoom());
            Greenfoot.delay(15);
        }
    }
   
   }
