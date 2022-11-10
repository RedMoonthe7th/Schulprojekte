import java.util.Scanner;


public class Taschenrechner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;
        boolean isFinished = false;

        while (isFinished == false)
        {
        System.out.println("Do you want to Add(a), Subtract(s), Multiply(m), Divide(d) or Exit(x)");
        char selection = input.next().charAt(0);
        switch (selection) {
            case 'a':
                System.out.println("What is the first Number?");
                firstNumber = input.nextInt();
                System.out.println("What is the second Number?");
                secondNumber = input.nextInt();
                result = firstNumber + secondNumber;
                System.out.println("The Result is " + result);
                break;
            case 's':
                System.out.println("What is the first Number?");
                firstNumber = input.nextInt();
                System.out.println("What is the second Number?");
                secondNumber = input.nextInt();
                result = firstNumber - secondNumber;
                System.out.println("The Result is " + result);
                break;

            case 'm':
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
            case 'x':
                isFinished = true;
                break;
        }
        }
    }
}

