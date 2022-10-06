
import java.util.Scanner;

public class Bankomat
{
    public static void main(String[] args)
    {

        boolean isFinished = false;
        double balance = 0;

        while(isFinished == false)
        {
            System.out.println("1. Einzahlen" + "\n" + "2. Auszahlen" + "\n" + "3. Kontostand" + "\n" + "4. Beenden");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    double deposited = scanner.nextDouble();
                    balance = balance + deposited;
                    System.out.println("Successfully added " + deposited + "€");
                    break;
                case 2:
                    double subtracted = scanner.nextDouble();
                    balance = balance - subtracted;
                    System.out.println("Successfully subtracted " + subtracted + "€");
                    break;
                case 3:
                    System.out.println("Your current balance is " + balance + "€");
                    break;
                case 4:
                    isFinished = true;
                    System.out.println("Please come back anytime");
                    break;
            }
        }
    }
}
