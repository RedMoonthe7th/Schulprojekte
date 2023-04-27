package OO_Handy;

public class PhoneFile
{
    //Variables
    private String name;
    private String extension;
    private double size;

    //Constructor
    public PhoneFile(String name, String extension, double size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    //Functions
    public void getInfo()
    {
        System.out.println("File name: " + name + extension);
        System.out.println("File size: " + size + " mb");
    }
    // Getter & Setter
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {this.size = size;}
}
