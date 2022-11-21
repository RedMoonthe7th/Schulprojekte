package OO_Car;

public class Car
{
    //Gedächtnisvariablen

    public int fuelConsumption;
    public int fuelAmount;
    public String serialNumber;
    public String brand;
    public String color;

    public void drive()
    {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving. Brumm Brumm");
    }
}
