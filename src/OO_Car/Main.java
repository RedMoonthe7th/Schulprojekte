package OO_Car;

public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.color = "blue";
        c1.serialNumber = "AS753";
        c1.fuelConsumption = 5;
        c1.fuelAmount = 50;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.color = "black";
        c2.serialNumber = "F43T2";
        c2.fuelConsumption = 9;
        c2.fuelAmount = 65;

        Car c3 = new Car();
        c3.brand = "Skoda";
        c3.color = "grey";
        c3.serialNumber = "K3K74";
        c3.fuelConsumption = 3;
        c3.fuelAmount = 45;

        c1.drive();
        System.out.println(c1.fuelAmount);

    }
}
