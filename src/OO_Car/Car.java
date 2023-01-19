package OO_Car;

public class Car
{
    //Gedächtnisvariablen

    private Engine engine;
    private int fuelConsumption;

    private String serialNumber;
    private String brand;
    private String color;

    public Car( String brand, String serialNumber, Engine engine)
    {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
    }

//Funktionen

    public void brake()
    {

        System.out.println("I brake now. No Brumm Brumm");
    }

    public void honk(int amountOfHonks)
    {
        for (int i = 0; i < amountOfHonks; i++)
        {
            System.out.println("Honk");
        }
    }



//Setter

    public void setEngine(Engine engine){

        this.engine = engine;
    }

    public void setColor(String color) {

        this.color = color;
    }


// Getter

    public String getColor() {
        return color;
    }
    public Engine getEngine() {return engine;}
}

