package OO_Car;

public class Main
{
    public static void main(String[] args)
    {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 5);
        e1.setOriginalFuelAmount(50);
        e1.setActualFuelAmount(40);

        Engine e2 = new Engine(160, Engine.TYPE.GAS, 9);
        e2.setOriginalFuelAmount(65);
        e2.setActualFuelAmount(54);

        Car c1 = new Car("Mercedes", "AS753", e1);
        c1.setColor("blue");


        Car c2 = new Car("BMW","F43T2", e1);
        c2.setColor("black");


        Car c3 = new Car("Skoda","K3K74", e2);
        c3.setColor("red");


        e1.drive(6);
        e1.superBoost();
        c1.honk(3);
        c1.brake();
    }
}
