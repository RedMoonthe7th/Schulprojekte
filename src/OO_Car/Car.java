package OO_Car;

public class Car
{
    //Gedächtnisvariablen

    public int fuelConsumption;
    public int originalFuelAmount;
    public int actualFuelAmount;
    public String serialNumber;
    public String brand;
    public String color;

    public void drive()
    {
        this.actualFuelAmount = this.actualFuelAmount - fuelConsumption;
        System.out.println("I am driving. Brumm Brumm");
    }
    public void brake()
    {
        System.out.println("I brake now. No Brumm Brumm");
    }
    public void superBoost()
    {

        if (this.actualFuelAmount > originalFuelAmount * 0.1)
        {
            System.out.println("SuperBoostMode activated");
        }
        else
        {
            System.out.println("Not enough Fuel to SpuperBoost");
        }
    }
    public void honk(int amountOfHonks)
    {
        for (int i = 0; i < amountOfHonks; i++)
        {
            System.out.println("Honk");
        }
    }
    public void getRemainingRange()
    {
        int remainingRange = this.actualFuelAmount / this.fuelConsumption;
        System.out.println("The remaining Range is " + remainingRange);
    }

}