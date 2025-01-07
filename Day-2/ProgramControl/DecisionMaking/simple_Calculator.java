import java.io.*;
import java.util.*;
class simple_Calculator
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        char operator=obj.next().charAt(0);
        int num2=obj.nextInt();
        int res=0;
        switch(operator)
        {
            case '+':
                res=num1 + num2;
                break;
            case '-':
                res=num1 - num2;
                break;
            case '*':
                res=num1 * num2;
                break;
            case '/':
                if(num2!=0)
                    res=num1/num2;
                else 
                {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operators");
                return;
        }
        System.out.println(res);
    }
}