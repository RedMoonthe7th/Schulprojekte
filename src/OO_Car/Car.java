package OO_Car;

public class Car
{
    //Gedächtnisvariablen

    private int fuelConsumption;
    private int originalFuelAmount;
    private int actualFuelAmount;
    private String serialNumber;
    private String brand;
    private String color;

    public Car(int fuelConsumption, String brand, String serialNumber)
    {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

//Funktionen
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
            System.out.println("I am Speed");
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

//Setter

    public void setActualFuelAmount(int actualFuelAmount) {

        this.actualFuelAmount = actualFuelAmount;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setOriginalFuelAmount(int originalFuelAmount) {
        this.originalFuelAmount = originalFuelAmount;
    }

// Getter

    public int getActualFuelAmount() {
        return actualFuelAmount;
    }

    public int getOriginalFuelAmount() {
        return originalFuelAmount;
    }

    public String getColor() {
        return color;
    }
}