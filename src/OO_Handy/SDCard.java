package OO_Handy;
import java.util.ArrayList;
import java.util.List;

public class SDCard
{
    //Variables
    private double capacity;
    private double filledCapacity;
    private List<PhoneFile> phoneFiles;

    //Constructor
    public SDCard(double capacity) {
        this.capacity = capacity;
    }

    //Functions
    public void saveFile()
    {
        double placeholder = 0;
        if (getCapacity() > getFilledCapacity() + placeholder)
        {

        }
        else
        {
            System.out.println("Not enough capacity available.");
        }
    }
    public void getAllFiles()
    {
        System.out.println(phoneFiles);
    }

    //Getter & Setter
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFilledCapacity() {
        return filledCapacity;
    }
    public void setFilledCapacity(double filledCapacity) {
        this.filledCapacity = filledCapacity;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }
    public void setPhoneFiles(List<PhoneFile> phoneFiles) {
        this.phoneFiles = phoneFiles;
    }
}
