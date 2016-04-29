import greenfoot.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;   
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
            Greenfoot.delay(15);
            backgroundMusic.stop();
        }
    }

    private void messageBoxes()
    {//opening messagebox
        GreenfootImage img = new GreenfootImage("Welcome to Build A Computer 4Kids or BACK", 100, Color.WHITE, Color.BLACK);
        img.drawImage(img, 200, 100);
        img = new GreenfootImage("Click Here", 100, Color.yellow, Color.black);
        img.drawImage(img, 540, 500);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Instructions instructions = new Instructions();
        addObject(instructions, 480, 506);
        instructions.setLocation(493, 502);
        instructions.setLocation(504, 488);
        //Title title = new Title();
        //addObject(title, 362, 107);
        //title.setLocation(526, 96);
    }
    public void stopped()
    {
        backgroundMusic.pause();
    }
    public void started()
    {
             
            backgroundMusic.play();
        
    }
}
