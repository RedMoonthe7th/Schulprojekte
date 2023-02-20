package at.xxx.examples.cars;

public class Car {
    //Gedächtnisvariablen

    private Engine engine;
    private Seller seller;
    private int maxSpeed;
    private int baseConsumption;
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
    public double price()
    {
        double actualPrice = this.basePrice - this.basePrice * (this.seller.getDiscount() / 100);
        return actualPrice;
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

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }
}
