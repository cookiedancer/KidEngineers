import greenfoot.*;
import java.awt.Color;

/**
 * This is the last part of the game.  
 * 
 * @author Tristan and Kevin 
 * Version: final
 */
public class Ending extends World
{

    /**
     * Constructor for objects of class Ending.
     * 
     */
    public Ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 607, 1); 
        GreenfootImage main = getBackground();
        main.setColor(Color.cyan);
        main.fill();
        GreenfootImage img = new GreenfootImage("Congatz!! and Thanks!", 50, Color.magenta, null);
        getBackground().drawImage(img, getWidth() /3 -20, 73);
        addObject(new MrClapper(), 270, getHeight() /2);
        addObject(new KevClapper(),810, getHeight() /2);
        //addObject(new DabSmiley(), 140, 520);
        
    }
    //public void act()
    {
        
        //Greenfoot.delay(1000);
        //addObject(new DabSmiley(), getWidth() /2, getHeight() /2);
    }
}
