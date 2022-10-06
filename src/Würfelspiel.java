import java.util.Random;
import java.util.Scanner;

public class Würfelspiel
{
    public static void main(String[] args)
    {

        Random dice = new Random();
        boolean isFinished = false;
        int vic_play = 0;
        int vic_com = 0;

        while(isFinished == false)
        {
            int total_play = 0;
            int total_com = 0;
            System.out.println("Dice Game Menu");
            System.out.println("Play a game with 6 dices(1)" + "\n" + "Exit(2)");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();

            switch (selection)
            {

                case 1:

                    int d1_play = 1 + dice.nextInt(6);
                    int d2_play = 1 + dice.nextInt(6);
                    int d3_play = 1 + dice.nextInt(6);
                    int d4_play = 1 + dice.nextInt(6);
                    int d5_play = 1 + dice.nextInt(6);
                    int d6_play = 1 + dice.nextInt(6);
                    total_play = d1_play + d2_play + d3_play + d4_play + d5_play + d6_play;
                    System.out.println("Player's Dice: ");
                    System.out.println(d1_play + "\n" + d2_play + "\n" + d3_play + "\n" + d4_play + "\n" + d5_play + "\n" + d6_play);

                    int d1_com = 1 + dice.nextInt(6);
                    int d2_com = 1 + dice.nextInt(6);
                    int d3_com = 1 + dice.nextInt(6);
                    int d4_com = 1 + dice.nextInt(6);
                    int d5_com = 1 + dice.nextInt(6);
                    int d6_com = 1 + dice.nextInt(6);
                    total_com = d1_com + d2_com + d3_com + d4_com + d5_com + d6_com;
                    System.out.println("Computer's Dice: ");
                    System.out.println(d1_com + "\n" + d2_com + "\n" + d3_com + "\n" + d4_com + "\n" + d5_com + "\n" + d6_com);

                    if(total_play > total_com)
                    {
                        vic_play =+ 1;
                        System.out.println("The Player has Won" + "\n" + "Player " + vic_play + ":" + vic_com + " Computer");
                    }
                    else if (total_com > total_play)
                    {
                        vic_com =+ 1;
                        System.out.println("The Computer has Won" + "\n" + "Player " + vic_play + ":" + vic_com + " Computer");
                    }
                    else
                    {
                        System.out.println("The Game is Draw");
                        System.out.println("The Player has Won" + "\n" + "Player " + vic_play + ":" + vic_com + " Computer");
                    }
                    break;
                case 2:
                    isFinished = true;
                    break;
            }
        }
    }
}
