import java.io.*;
import static java.lang.Math.*;
import java.util.Scanner;
public class hypotanuse
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        double sideA=obj.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double sideB=obj.nextDouble();
        double hypotenuse=sqrt(pow(sideA,2)+pow(sideB, 2));
        System.out.println("The hypotenuse of the triangle is: "+hypotenuse);
    }
}
