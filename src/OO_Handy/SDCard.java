package OO_Handy;
import java.util.ArrayList;
import java.util.List;

public class SDCard
{
    //Variables
    private double capacity;
    private List<PhoneFile> files;

    //Constructor
    public SDCard(double capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    //Functions
    public void saveFile(PhoneFile file)
    {
        double placeholder = 0;
        if (getCapacity() > placeholder)
        {
            files.add(file);
        }
        else
        {
            System.out.println("Not enough capacity available. Please delete something, before trying once again");
        }
    }
    public void getAllFiles()
    {
        System.out.println(files);
    }
    public double getFreeSpace()
    {
        int size = 0;
        for(PhoneFile phoneFile : files)
        {
            size += phoneFile.getSize();
        }
        return capacity - size;
    }

    //Getter & Setter
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getFiles() {return files;}
    public void setFiles(List<PhoneFile> files) {this.files = files;}
}
