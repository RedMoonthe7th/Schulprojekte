package Repetition_LastYear;

public class Plane
{
    //Variables
    private float height;
    private float width;
    private float length;
    private float weight;
    private int altitude;
    private int speed;
    private String owner;

    //Constructor
    public Plane(float height, float width, float length, float weight, int altitude, int speed, String owner) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.altitude = altitude;
        this.speed = speed;
        this.owner = owner;
    }

    //Functions
    public void takeOff()
    {
        System.out.println("Starting the flight now");
    }
    public void land()
    {
        System.out.println("We have reached the destination of our journey. The exit is to your left");
    }
    public void changeAltitude(int newAltitude)
    {
        System.out.println("Adjusting altitude.");
        this.altitude = newAltitude;
        System.out.println("New altitude of "+ this.altitude + " m has been reached");

    }
    // Getter & Setter

    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
