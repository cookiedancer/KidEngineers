import greenfoot.*;
import java.awt.Color;

/**
 * I count up
 * 
 * @author Tristan and Kevin
 * @version: final
 */
public class Timer extends Actor

{
    private int count; // the counter field
    private int initialCount; // the initial time given before event occurs
    private boolean running;
 
    public Timer()
    {
        this(0, true);
    }
 
    public Timer (int timeBeforeEvent)
    {
        this(timeBeforeEvent, true);
    }
 
    public Timer(int timeBeforeEvent, boolean getsStarted) // int value given in seconds
    {
        setTimer(timeBeforeEvent);
        updateImage();
        running = getsStarted;
    }
 
    public void setTimer(int timeBeforeEvent)
    {
        initialCount = 30 * timeBeforeEvent;
        count = -initialCount;
    }
 
    private void updateImage()
    {
        String prefix = "T - ";
        if (count >= 0) prefix = "Timer ";
        int time = count * (int)Math.signum(count);
        time = time / 30;
        int secs = time % 30;
        time = (time - secs) / 30;
        int mins = time % 30;
        int hrs = (time - mins) / 24;
        String h = "00"+hrs;
        while (h.length() > 2) h = h.substring(1);
        String m = "00"+mins;
        while (m.length() > 2) m = m.substring(1);
        String s = "00" + secs;
        while (s.length() > 2) s = s.substring(1);
        String text = prefix + s + "s";
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.black, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+20, textImage.getHeight()+10);
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
        setImage(image);
    }
 
    public void act()
    {
        if (running)
        {
            count++;
            if ((count + initialCount) % 30 == 0) updateImage();
        }
    }
 
    public int getTime()
    {
        return count / 30;
    }
 
    public void start()
    {
        running = true;
    }
 
    public void stop()
    {
        running = false;
    }
}