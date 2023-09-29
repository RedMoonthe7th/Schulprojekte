package Repetition_LastYear;

public class Hangar
{
    //Variables
    private int planeCapacity;
    private String color;
    private String location;
    private String owner;
    private float width;
    private float length;
    private float height;
    private boolean isLocked;

    //Constructor


    public Hangar(int planeCapacity, String color, String location, String owner, float width, float length, float height, boolean isLocked) {
        this.planeCapacity = planeCapacity;
        this.color = color;
        this.location = location;
        this.owner = owner;
        this.width = width;
        this.length = length;
        this.height = height;
        this.isLocked = isLocked;
    }

    // Functions
    public void checkUp()
    {
        System.out.println("Everything seems to be in order");
    }
    public void clean()
    {
        System.out.println("You will scrub this plane with a toothbrush");
    }
    public void open()
    {
        System.out.println("The Hangar is open now. Don't forget to close it afterwards");
        this.isLocked = false;
        System.out.println(this.isLocked);
    }
    public void lock()
    {
        System.out.println("The Hangar is closed now.");
        this.isLocked = true;
        System.out.println(this.isLocked);
    }

    // Getter & Setter
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isLocked() {
        return isLocked;
    }
    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
