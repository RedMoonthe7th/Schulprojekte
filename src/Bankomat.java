
import java.util.Scanner;

public class Bankomat
{
    public static void main(String[] args)
    {
        System.out.println("1. Einzahlen" + "\n" + "2. Auszahlen" + "\n" + "3. Kontostand" + "\n" + "4. Beenden");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        Scanner betrag = new Scanner(System.in);
        double moneysum = betrag.nextDouble();

        do {
            switch (selection) {
                case 1:

                    System.out.println(1);
                    break;
                case 2:

                    System.out.println(2);
                    break;
                case 3:

                    System.out.println(3);
                    break;
                case 4:

                    System.out.println(4);
                    break;
            }
        }while(selection != 4);
    }
}
