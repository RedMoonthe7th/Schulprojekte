package OO_Car;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isFinished = false;


        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.color = "blue";
        c1.serialNumber = "AS753";
        c1.fuelConsumption = 5;
        c1.originalFuelAmount = 50;
        c1.actualFuelAmount = c1.originalFuelAmount;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.color = "black";
        c2.serialNumber = "F43T2";
        c2.fuelConsumption = 9;
        c2.originalFuelAmount = 65;
        c2.actualFuelAmount = c2.originalFuelAmount;

        Car c3 = new Car();
        c3.brand = "Skoda";
        c3.color = "grey";
        c3.serialNumber = "K3K74";
        c3.fuelConsumption = 3;
        c3.originalFuelAmount = 45;
        c3.actualFuelAmount = c3.originalFuelAmount;

        while(!isFinished)
        {
            System.out.println("Do you want to drive(d), break(b), superboost(s), honk(h) or figure out how much remaining range your car has(r)?" + "\n" + "Exit(x)");
            char selection = input.next().charAt(0);
            switch (selection)
            {
                case 'd':
                    System.out.println(c1.actualFuelAmount);
                    c1.drive();
                    System.out.println("Current Fuel:" + c1.actualFuelAmount);
                    break;

                case 'b':
                    c1.brake();
                    break;

                case 's':
                    c1.superBoost();
                    break;

                case 'h':
                    System.out.println("How often would you like to Honk?");
                    int amountOfHonks = input.nextInt();
                    c1.honk(amountOfHonks);
                    break;

                case 'r':
                    c1.getRemainingRange();
                    break;

                case 'x':
                    isFinished = true;
                    break;
            }
        }
    }
}
