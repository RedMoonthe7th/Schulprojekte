import java.util.Scanner;

public class StringHelper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isFinished = false;
        String messageToCheckPalindrome = "";
        char letter;
        String messageToCountLetters = "";
        String messageToReverse = "";

        while(!isFinished)
        {
            System.out.println("Palindrome Check(p)" + "\n" + "Count letters(c)" + "\n" + "Reverse Message(r)" + "\n" + "Amount of Letters(a)" + "\n" + "Exit(x)");
            char selection = input.next().charAt(0);

            switch (selection)
            {
                case 'p':
                    System.out.println("Please enter the Message in only small cases");
                    messageToCheckPalindrome = input.next();
                    boolean palindromeCheck = isPalindrome(messageToCheckPalindrome);
                    if (palindromeCheck == false)
                    {
                        System.out.println("The Message isn't a Palindrome");
                    }
                    else
                    {
                        System.out.println("The Message is a Palindrome");
                    }
                    break;
                case 'c':
                    System.out.println("Which Letter is being searched?");
                    letter = input.next().charAt(0);
                    System.out.println("Please enter the Message");
                    messageToCountLetters = input.next();
                    String countedMessage = countLetters(letter, messageToCountLetters);
                    break;
                case 'r':
                    System.out.println("Please enter the Message you wish to be reversed");
                    messageToReverse = input.next();
                    String reverseMessage = reversingMessage(messageToReverse);
                    break;
                case 'a':
                    break;
                case 'x':
                    isFinished = true;
                    break;
            }
        }
    }
    public static boolean isPalindrome(String messageToCheckPalindrome)
    {
        char[] inputMessage = messageToCheckPalindrome.toCharArray();
        char[] revertedMessage = reversingMessage(messageToCheckPalindrome).toCharArray();
        boolean palindromeCheck = true;
        for(int i = 0; i < inputMessage.length; i++)
        {
            int currentLetter = inputMessage[i];
            int currentRevertedLetter = revertedMessage[i];

            if (currentLetter != currentRevertedLetter)
            {
                palindromeCheck = false;
            }
        }
        return palindromeCheck;

    }
    public static String countLetters(char letter, String messageToCountLetters)
    {

        return"";
    }
    public static String reversingMessage(String messageToReverse)
    {
        char[] inputMessage = messageToReverse.toCharArray();
        char[] resultingMessage = new char[inputMessage.length];
        int counter = 0;
        for(int i = inputMessage.length-1; i >=0; i--)
        {
            resultingMessage[counter]= inputMessage[i];
            counter++;
        }
        return String.valueOf(resultingMessage);
    }
    public static String amountOfLetters(String messageToCountAmount )
    {

        return"";
    }
}

