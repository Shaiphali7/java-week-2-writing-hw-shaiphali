package java_week_2_writing_hw_shaiphali;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the uppercase string: ");
        String uppercase=scanner.next();
        Programme_9_ConvertUpperToLowerCase t=new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseTolowerCase(uppercase);
        //Closing the scanner object
        scanner.close();
    }
    public void convertUppercaseTolowerCase(String text){

        System.out.println("The lowercase is= "+text.toLowerCase());
    }
}
