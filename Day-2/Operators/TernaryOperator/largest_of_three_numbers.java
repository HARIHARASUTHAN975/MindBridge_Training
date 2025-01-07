import java.io.*;
import java.util.*;
class largest_of_three_numbers
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        int num3=obj.nextInt();
        int largest=num1;
        if(num1==num2 && num1==num3)
        {
            System.out.println("The Given Numbers are Equal");
        }
        else
        {
            if(num2>largest)
            {
                largest=num2;
            }
            if(num3>largest)
            {
                largest=num3;
            }
        System.out.println("The Largest Number is: "+largest);
    }
    }
}