package OO_Handy;

public class Camera
{
    //Variables
    private int fileNumber = 0;
    private int resolution;

    //Constructor

    //Functions
    public PhoneFile takePicture()
    {
        PhoneFile file = new PhoneFile("pic" + fileNumber, ".jpg", resolution);
        fileNumber++;
        return file;
    }

    //Getter & Setter

}
