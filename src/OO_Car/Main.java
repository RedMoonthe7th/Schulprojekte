package OO_Car;

public class Main
{
    public static void main(String[] args)
    {


        Car c1 = new Car(5,"Mercedes", "AS753");
        c1.setColor("blue");
        c1.setOriginalFuelAmount(50);
        c1.setActualFuelAmount(40);

        Car c2 = new Car(9,"BMW","F43T2");
        c2.setColor("black");
        c2.setOriginalFuelAmount(65);
        c2.setActualFuelAmount(54);

        Car c3 = new Car(3,"Skoda","K3K74");
        c3.setColor("red");
        c3.setOriginalFuelAmount(40);
        c3.setActualFuelAmount(34);

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);

        c1.drive(6);
        c1.superBoost();
        c1.honk(3);
        c1.brake();
    }
}
