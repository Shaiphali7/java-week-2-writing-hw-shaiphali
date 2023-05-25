package java_week_2_writing_hw_shaiphali;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the length of the triangle: ");
        int length=scanner.nextInt();
        System.out.println("Please enter the height of the triangle: ");
        int height=scanner.nextInt();
        areaOfTriangle(height,length);
        //Closing the scanner object
        scanner.close();

    }
    //Calculating the area of triangle
    public static void areaOfTriangle(int length,int height){
        int area=(length*height)/2;
        System.out.println("The area of triangle is: "+area);
    }
}
