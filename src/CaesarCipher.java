import java.util.Scanner;

public class CaesarCipher
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        boolean isFinished = false;
        int key;
        String messageToEncrypt = "";
        String messageToDecrypt = "";

        while(!isFinished)
        {
            System.out.println("Encrypt(e) a message" + "\n" + "Decrypt(d) a message" + "\n" + "Exit(x)");
            char selection = input.next().charAt(0);
            switch (selection)
            {
                case 'e':
                    System.out.println("Please enter the Key");
                    key = input.nextInt();
                    System.out.println("Please enter the Message");
                    messageToEncrypt = input.next();
                    String encryptedMessage = encrypt(key, messageToEncrypt);
                    System.out.println("The encrypted Message is:" + "\n" + encryptedMessage);
                    break;
                case 'd':
                    System.out.println("Please enter the Key");
                    key = input.nextInt();
                    System.out.println("Please enter the Message");
                    messageToDecrypt = input.toString();
                    String decryptedMessage = decrypt(key, messageToDecrypt);
                    System.out.println("The decrypted Message is:" + "\n" + decryptedMessage);
                    break;
                case 'x':
                    isFinished = true;
                    break;
            }
        }
    }
    public static String encrypt(int key, String messageToEncrypt)
    {
        String encryptedResult = "";
        char[] inputMessage = messageToEncrypt.toCharArray();
        for(int i = 0; i < inputMessage.length; i++)
        {
            int letter = inputMessage[i] + key;
            encryptedResult += Character.toString(letter);
        }
        return encryptedResult;
    }
    public static String decrypt(int key, String messageToDecrypt)
    {
        String decryptedResult = "";
        char[] inputMessage = messageToDecrypt.toCharArray();
        for(int i = 0; i < inputMessage.length; i++)
        {
            int letter = inputMessage[i] + key;
            decryptedResult += Character.toString(letter);
        }
        return decryptedResult;
    }
}
