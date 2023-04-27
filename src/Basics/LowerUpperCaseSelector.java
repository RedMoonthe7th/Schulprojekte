package Basics;

import java.util.Scanner;

public class LowerUpperCaseSelector {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String upperCases = "";
        String lowerCases = "";
        String message = "";
        message = input.next();
        char[] arr = message.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            if(Character.isUpperCase(arr[i]))
            {
                upperCases = upperCases + (arr[i]);
            }
            else
            {
                lowerCases = lowerCases + (arr[i]);
            }
        }
        System.out.println(upperCases);
        System.out.println(lowerCases);
    }

}
