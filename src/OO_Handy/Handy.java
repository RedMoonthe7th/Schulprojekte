package OO_Handy;

import java.util.List;

public class Handy
{
    //Variables
    private String color;
    private SIMCard sim;
    private Camera camera;
    private SDCard sdcard;

    //Constructor
    public Handy(String color, SIMCard sim, Camera camera, SDCard sdcard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdcard = sdcard;
    }

    //Functions
    public void doCall(String number)
    {
        this.sim.doCall(number);
    }
    public void takePicture()
    {
        PhoneFile file = this.camera.takePicture();
    }
    public void printAllFiles()
    {
        List<PhoneFile> files = this.sdcard.getFiles();
        for(PhoneFile file : files)
        {
            System.out.println(file.getInfo());
        }
    }
    public double getFreeSpace()
    {
        return this.sdcard.getFreeSpace();
    }

    //Getter & Setter

}
