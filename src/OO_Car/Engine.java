package OO_Car;

import java.lang.reflect.Type;

public class Engine {

    private int horsePower;
    public enum TYPE {DIESEL, GAS}
    private TYPE type;
    private  int fuelConsumption;
    private int originalFuelAmount;
    private int actualFuelAmount;

    public Engine(int horsePower, TYPE type, int fuelConsumption) {
        this.horsePower = horsePower;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(int speed)
    {
        this.actualFuelAmount = this.actualFuelAmount - fuelConsumption;
        System.out.println("I am driving with so much speed: "+ speed +" Brumm Brumm");
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
    public void getRemainingRange()
    {
        int remainingRange = this.actualFuelAmount / this.fuelConsumption;
        System.out.println("The remaining Range is " + remainingRange);
    }

    // Setter
    public void setActualFuelAmount(int actualFuelAmount) {

        this.actualFuelAmount = actualFuelAmount;
    }
    public void setOriginalFuelAmount(int originalFuelAmount) {

        this.originalFuelAmount = originalFuelAmount;
    }
    // Getter
    public int getHorsePower() {
        return horsePower;
    }
    public TYPE getType() {
        return type;
    }
    public int getActualFuelAmount() {
        return actualFuelAmount;
    }
    public int getOriginalFuelAmount() {
        return originalFuelAmount;
    }
}
