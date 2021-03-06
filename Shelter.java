import greenfoot.*;

/**
 * Write a description of class Shelter here.
 * 
 * Tristan Walker 
 * 1
 */
public class Shelter extends World
{
    private Pet[] pets;
    private static final int NUMBER_OF_PETS = 5;
    private String [] petNames;
    private String [] petImageFileNames;
    private String [] petSoundFileNames;

    /**
     * Constructor for objects of class Shelter.
     * 
     */
    public Shelter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        this.pets = new Pet[NUMBER_OF_PETS];
        this.petNames = new String[] {"Skip", "Celine", "Wisey", "Slinky", "Rolley"};
        this.petImageFileNames = new String[] {"frog", "sheep", "elephant", "snake", "pig"};
        this.petSoundFileNames = new String[] {"croak", "baa", "elephant", "snakehiss", "oink"};
        for (int i = 0; i < this.pets.length; i++) 
        { 
            Pet shelterPet = new Pet(this.petNames[i],0,
            this.petImageFileNames[i] + ".png",
            this.petSoundFileNames[i] + ".wav");
            this.pets[i] = shelterPet;
        }
        this.placePets(); 
    }
    public void placePets()
    {
        for (int i= 0; i < this.pets.length; i++) 
        {
            addObject (pets[i], Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(300));
            pets[i].playPetSound();
            Greenfoot.delay(5);
        }
    }
}
