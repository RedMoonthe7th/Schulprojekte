import java.util.Random;
import java.util.Scanner;

public class DiceGame
{
    public static void main(String[] args)
    {

        Random dice = new Random();
        boolean isFinished = false;
        int victoriesPlayer = 0;
        int victoriesComp = 0;

        while(!isFinished)
        {
            int diceSumPlayer = 0;
            int diceSumComp = 0;
            System.out.println("Dice Game Menu");
            System.out.println("Play a game with 6 dices(1)" + "\n" + "Exit(2)");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();

            switch (selection)
            {
                case 1:
                    for(int i=0; i< 7; i++)
                    {
                        int dicePlayer = 1 + dice.nextInt(6);
                        System.out.println(dicePlayer);
                        diceSumPlayer = diceSumPlayer + dicePlayer;
                    }
                    System.out.println("Player's Total Dice Count: " + "\n" + diceSumPlayer + "\n");

                    for(int i=0; i< 7; i++)
                    {
                        int diceComp = 1 + dice.nextInt(6);
                        System.out.println(diceComp);
                        diceSumComp = diceSumComp + diceComp;
                    }
                    System.out.println("Computer's Dice Count: " + "\n" + diceSumComp + "\n");

                    if(diceSumPlayer > diceSumComp)
                    {
                        victoriesPlayer = victoriesPlayer + 1;
                        System.out.println("The Player has Won" + "\n" + "Player " + victoriesPlayer + ":" + victoriesComp + " Computer");
                    }
                    else if (diceSumComp > diceSumPlayer)
                    {
                        victoriesComp = victoriesComp + 1;
                        System.out.println("The Computer has Won" + "\n" + "Player " + victoriesPlayer + ":" + victoriesComp + " Computer");
                    }
                    else
                    {
                        System.out.println("The Game is Draw" + "\n" + "Player " + victoriesPlayer + ":" + victoriesComp + " Computer");
                    }
                    break;

                case 2:
                    isFinished = true;
                    break;
            }
        }
    }
}
