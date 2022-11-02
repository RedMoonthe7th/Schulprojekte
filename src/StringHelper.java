import java.util.Scanner;

public class StringHelper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isFinished = false;

        while(!isFinished)
        {
            System.out.println("Palindrome Check(p)" + "\n" + "Count letters(c)" + "\n" + "Reverse Message(r)" + "\n" + "Amount of Letters(a)" + "\n" + "Exit(x)");
            char selection = input.next().charAt(0);

            switch (selection)
            {
                case 'p':
                    String encryptedMessage = isPalindrome("placeholder");
                    break;
                case 'c':
                    break;
                case 'r':
                    break;
                case 'a':
                    break;
                case 'x':
                    isFinished = true;
                    break;
            }
        }
    }
    public static String isPalindrome(String palindromeMessage)
    {

        return"";
    }
    public static String countLetters(char letter, String countMessage)
    {

        return"";
    }
    public static String reverseMessage(String messageToReverse)
    {

        return"";
    }
    public static String amountOfLetters(String )
    {

        return"";
    }
}

