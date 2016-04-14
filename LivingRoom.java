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
        addObject(new Motherboard(),1003,537);
        addObject(new Harddrive(),877,505);
        addObject(new PowerSupply(),872,571);
        addObject(new Memory(),772,492);
        addObject(new BluerayDrive(),785,579);
        addObject(new Videocard(),652,568);
    }
}
