import greenfoot.*;

/**
 * Write a description of class Tower here.
 * 
 * // Tristan and Kevin
 * //Version 1.0
 */
public class Tower extends Actor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public Tower()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 150, image.getHeight() + 150);
        setImage(image);
    }
}
