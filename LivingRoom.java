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
    GreenfootSound backgroundMusic = new GreenfootSound("Doug.mp3");

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
        backgroundMusicstop();
        //prepare();
        
        CompParts processor = new Processor();
        processor.setDescription("I am a CPU or a central processing unit.\nI control everything about the computer.\nI am the brains.");
        addObject(processor, 458, 255);
         
        // the red dot
        CompParts harddrive = new Harddrive();
        harddrive.setDescription("I am a Harddrive.\nI store all of your stuff.\nThink of me like a toy chest\nbut much smaller.");
        addObject(harddrive, 207, 314);
        
        //the yellow dot
        CompParts blueraydrive = new BluerayDrive();
        blueraydrive.setDescription("I am a blueray or disk drive .\nI am where you put all types of disk.\nI help you install stuff.\nOr I can play your movie for you.");
        addObject(blueraydrive, 333, 315);
        
        //the green dot
        CompParts powerSupply = new PowerSupply();
        powerSupply.setDescription("I am you Power Supply.\nI get plugged into the wall.\nWithout me your computer doesn't come on.");
        addObject(powerSupply, 458, 317);
        
        // the blue dot
        CompParts memory = new Memory();
        memory.setDescription("I am your memory.\nMy friends call me RAM.\nI help your computer store stuff for a little while.\nIm like an quick stay hotel for your tasks.");
        addObject(memory, 569, 305);
         
        // the red dot
        CompParts videocard = new Videocard();
        videocard.setDescription("I am your Video Card.\nWithout me you see nothing.\nYour monitor plugs into my backside.");
        addObject(videocard, 891, 287);
        
        //the yellow dot
        CompParts motherboard = new Motherboard();
        motherboard.setDescription("I am your Motherboard.\nEvery single piece plugs into me somehow.\nI am the foundation your computer is built from.\nYou kinda need me.");
        addObject(motherboard, 730, 315);
        
        addObject(new Instructions3(), 864, 565);
        addObject(new Instructions2(), 771, 519);
        
        
    }
    public void act()
    {
        beginGame();
         
        
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
        Tower tower = new Tower();
        addObject(tower, 672, 506);
        tower.setLocation(181, 545);
        tower.setLocation(151, 543);
        Processor processor = new Processor();
        addObject(processor, 98, 148);
        Instructions2 instructions2 = new Instructions2();
        addObject(instructions2, 474, 52);
        instructions2.setLocation(539, 31);
        Instructions3 instructions3 = new Instructions3();
        addObject(instructions3, 505, 247);
        instructions3.setLocation(535, 225);
        instructions3.setLocation(557, 291);
        instructions2.setLocation(784, 552);
        instructions2.setLocation(778, 571);
        processor.setLocation(95, 219);
        harddrive.setLocation(207, 214);
        blueraydrive.setLocation(333, 215);
        powersupply.setLocation(458, 217);
        memory.setLocation(589, 205);
        videocard.setLocation(720, 215);
        motherboard.setLocation(891, 187);
    }

    public void backgroundMusicstop()
    {
        backgroundMusic.stop();
    }
    void beginGame()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new LetsBuild());
            Greenfoot.delay(15);
            backgroundMusic.stop();
        }
    }
}
