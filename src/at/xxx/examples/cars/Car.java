package at.xxx.examples.cars;
import java.util.Scanner;

public class Car {
    //Gedächtnisvariablen

    private Engine engine;
    private Seller seller;
    private int maxSpeed;
    private double baseConsumption;
    private double basePrice;
    private String color;

    // Constructor
    public Car(Engine engine, Seller seller, int maxSpeed, int baseConsumption, double basePrice) {
        this.engine = engine;
        this.seller = seller;
        this.maxSpeed = maxSpeed;
        this.baseConsumption = baseConsumption;
        this.basePrice = basePrice;
    }

    // Methods
    public double getPrice()
    {
        double actualPrice = this.basePrice - this.basePrice * (this.seller.getDiscount() / 100.0);
        return actualPrice;
    }
    public double getConsumption()
    {
        Scanner input = new Scanner(System.in);
        int distance = 0;
        double consumptionOverDistance = 0.0;
        System.out.println("Geben Sie die zu fahrende Strecke ein:");
        distance = input.nextInt();
        for(int i = 0; i < distance; i++)
        {
            if (i + 1 > 50000)
            {
                consumptionOverDistance += this.baseConsumption * 1.098;
            }
            else
            {
                consumptionOverDistance += this.baseConsumption;
            }
        }
        return consumptionOverDistance;
    }
    // Setter
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter
    public Engine getEngine() {
        return engine;
    }

    public Seller getSeller() {
        return seller;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }
}
