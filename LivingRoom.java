import greenfoot.*;

/**
 * This is our first prototype.  Eventually this will have multiple cut scenes leading into the game, and
 * possibly even cut scenes after each successful placement of a part.
 * 
 * //Tristan Walker 
 * //Version 1.0
 */
public class LivingRoom extends World
{

    /**
     * in this world we will be building a computer and learning the very basics about computer parts 
     * and their over all importance in the build of a computer.
     * 
     */
    public LivingRoom()
    {    
        // 
        super(1080, 607, 1); 
        //addObject(new Motherboard(),1003,537);
        //addObject(new Harddrive(),877,505);
        //addObject(new PowerSupply(),872,571);
        //addObject(new Memory(),772,492);
        //addObject(new BluerayDrive(),785,579);
        //addObject(new Videocard(),652,568);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Motherboard motherboard = new Motherboard();
        addObject(motherboard, 891, 114);
        Videocard videocard = new Videocard();
        addObject(videocard, 724, 124);
        Memory memory = new Memory();
        addObject(memory, 582, 125);
        PowerSupply powersupply = new PowerSupply();
        addObject(powersupply, 459, 132);
        BluerayDrive blueraydrive = new BluerayDrive();
        addObject(blueraydrive, 334, 127);
        Harddrive harddrive = new Harddrive();
        addObject(harddrive, 217, 139);
    }
}
