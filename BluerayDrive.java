import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class BluerayDrive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluerayDrive extends CompParts
{
    private boolean mouseOn;
    /**
     * Act - do whatever the BluerayDrive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        clickee();
        mouseHover();
    }
    public void mouseHover()
    {
        if (getWorld() instanceof LivingRoom && Greenfoot.mouseMoved(null) && mouseOn != Greenfoot.mouseMoved(this))
        {
         mouseOn = !mouseOn;
        if (mouseOn) showMessage(); else hideMessage();
        }

      }
    public void showMessage()
    {
      GreenfootImage brinfo = new GreenfootImage("A bluray drive is where you would put and cd's, dvd's, or bluray", 100, Color.black, Color.white); 
      brinfo.drawImage(brinfo, 200, 100);
    }
    public void hideMessage()
    {
        
    }
   
}
