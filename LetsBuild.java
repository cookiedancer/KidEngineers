import greenfoot.*;

/**
 * Write a description of class LetsBuild here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetsBuild extends World
{

    /**
     * Constructor for objects of class LetsBuild.
     * 
     */
    public LetsBuild()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 607, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Tower2 tower2 = new Tower2();
        addObject(tower2, 816, 324);
        Videocard videocard = new Videocard();
        addObject(videocard, 90, 70);
        Memory memory = new Memory();
        addObject(memory, 90, 172);
        Harddrive harddrive = new Harddrive();
        addObject(harddrive, 90, 293);
        harddrive.setLocation(90, 270);
        PowerSupply powersupply = new PowerSupply();
        addObject(powersupply, 90, 364);
        BluerayDrive blueraydrive = new BluerayDrive();
        addObject(blueraydrive, 90, 442);
        Motherboard motherboard = new Motherboard();
        addObject(motherboard, 90, 539);
        Processor processor = new Processor();
        addObject(processor, 90, 322);
        blueraydrive.setLocation(90, 453);
        powersupply.setLocation(90, 397);
        memory.setLocation(90, 169);
        videocard.setLocation(90, 54);
        memory.setLocation(90, 152);
        harddrive.setLocation(90, 247);
        powersupply.setLocation(90, 328);
        processor.setLocation(90, 400);
    }
}
