package Repetition_LastYear;

public class PassengerPlane extends Plane
{
    //Variables
    private int passengerCapacity;
    private int travelLength;
    private String color;

    //Constructor
    public PassengerPlane(float height, float width, float length, float weight, int altitude, int speed, String owner, int passengerCapacity, int travelLength, String color) {
        super(height, width, length, weight, altitude, speed, owner);
        this.passengerCapacity = passengerCapacity;
        this.travelLength = travelLength;
        this.color = color;
    }

    //Functions
    public void food()
    {
        System.out.println("I am afraid we are out of salted nuts");
    }
    public void drinks()
    {
        System.out.println("Alcoholic beverages cost extra, Sir");
    }
    public void announcement()
    {
        System.out.println("Attention please. This is your captain speaking. As you might have noticed, the plane has been taken hostage by terrorists. Please remain calm");
    }

    // Getter & Setter
    public int getTravelLength() {
        return travelLength;
    }
    public void setTravelLength(int travelLength) {
        this.travelLength = travelLength;
    }
}
