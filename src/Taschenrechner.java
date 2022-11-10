import java.util.Scanner;


public class Taschenrechner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char selection = input.next().charAt(0);
        int firstNumber;
        int secondNumber;
        int result;

        switch (selection) {
            case 'p':
                System.out.println("What is the first Number?");
                firstNumber = input.nextInt();
                System.out.println("What is the second Number?");
                secondNumber = input.nextInt();
                result = firstNumber + secondNumber;
                System.out.println("The Result is " + result);
                break;
            case 'm':
                System.out.println("What is the first Number?");
                firstNumber = input.nextInt();
                System.out.println("What is the second Number?");
                secondNumber = input.nextInt();
                result = firstNumber - secondNumber;
                System.out.println("The Result is " + result);
                break;

            case 'x':
                System.out.println("What is the first Number?");
                firstNumber = input.nextInt();
                System.out.println("What is the second Number?");
                secondNumber = input.nextInt();
                result = firstNumber * secondNumber;
                System.out.println("The Result is " + result);
                break;

            case 'd':
                System.out.println("What is the first Number?");
                firstNumber = input.nextInt();
                System.out.println("What is the second Number?");
                secondNumber = input.nextInt();
                result = firstNumber / secondNumber;
                System.out.println("The Result is " + result);
                break;

        }
    }
}

