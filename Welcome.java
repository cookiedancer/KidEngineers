import greenfoot.*;
import java.awt.Color;

   
/**
 * Welcome is what the name implies.  the player will be greeted by music from the hit show Doug as well as a dancing computer.
 * 
 * Tristan and Kevin 
 * Version 6 final
 */
public class Welcome extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("Doug.mp3");

    /**
     * Constructor for objects of class Welcome.
     * 
     */
    public Welcome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 607, 1);
        GreenfootImage main = getBackground();
        main.setColor(Color.blue);
        main.fill();
        addObject(new DancingComputer(), getWidth() /2,getHeight() /2);
        //messageBoxes();
        GreenfootImage img = new GreenfootImage("Welcome to Build A Computer 4Kids or BACK", 50, Color.WHITE, null);
        getBackground().drawImage(img, 100, 100);
        img = new GreenfootImage("Click Enter to Continue", 50, Color.white, null);
        getBackground().drawImage(img, 300, 480);
        

        //prepare();
        
    }

    public void act()
    {
        //messageBoxes();
        beginGame();
         
        
    }

    void beginGame()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            
            Greenfoot.setWorld(new LivingRoom());
            
            backgroundMusic.stop();
        }
    }
    public void started()
    {
             
            backgroundMusic.play();
        
    }
}
