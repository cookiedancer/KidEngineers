import greenfoot.*;

/**
 * Write a description of class Pet here.
 * 
 * Tristan Walker 
 * version 1
 */
public class Pet extends MightyPet
{
    private String name;
    private int age;
    private String image;
    private String sound;
    private boolean isFriendly;
    public Pet()
    {
        this.name = new String();
        this.age = 0;
        this.sound = new String("boing.wav");
        this.isFriendly = false;
        this.playPetSound();
    }
    public Pet(String petName, int petAge, String imageFileName, String soundFileName)
    {
        this.name = petName;
        this.age = petAge;
        this.image = imageFileName;
        this.sound = soundFileName;
        this.isFriendly = false;
        setImage(this.image);
    }
    /**
     * Act - do whatever the Pet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public void playPetSound()
    {
        Greenfoot.playSound(this.sound);
    }
}
