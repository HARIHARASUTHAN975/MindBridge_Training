import java.io.*;
import java.util.*;
public class Exception_Handling
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        try
        {
            System.out.print("Enter the first Number : ");
            int num1=obj.nextInt();
            System.out.print("Enter the second Numebr : ");
            int num2=obj.nextInt();
            int res=num1/num2;
            System.out.println("Result: "+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Please enter valid integers.");
        }
        catch(Exception e)
        {
            System.out.println("An unexpected error occurred.");
        }
    }
}

