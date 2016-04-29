import greenfoot.*;

/**
 /**
 * The living room is world number 2.  here the player will be givin onscreen instructions detailing what to do.  boxes will up up
 * letting them know about the parts
 * Tristan and Kevin 
 * Version: final
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
        
        Greenfoot.delay(10);
        backgroundMusicstop();
                
        CompParts processor = new Processor();
        processor.setDescription("I am a CPU or a central processing unit.\nI control everything about the computer.\nI am the brains.");
        addObject(processor, 458, 255);
         
        // the red dot
        CompParts harddrive = new Harddrive();
        harddrive.setDescription("I am a Hard drive.\nI store all of your stuff.\nThink of me like a toy chest,\nbut much smaller.");
        addObject(harddrive, 207, 314);
        
        //the yellow dot
        CompParts blueraydrive = new BluerayDrive();
        blueraydrive.setDescription("I am a bluray or disk drive .\nYou can put movies in me.\n.Or games to be installed.");
        addObject(blueraydrive, 333, 315);
        
        //the green dot
        CompParts powerSupply = new PowerSupply();
        powerSupply.setDescription("I am your Power Supply.\nI get plugged into the wall.\nWithout me your computer doesn't come on.\nI'm kind of a big deal");
        addObject(powerSupply, 458, 317);
        
        // the blue dot
        CompParts memory = new Memory();
        memory.setDescription("I am your memory.\nMy friends call me RAM.\nI am like short term parking for your tasks.\nLoad em' up and let em' go.");
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
