import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorToFindMaxOfTwoNumbers {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1= obj.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2=obj.nextInt();
        IntBinaryOperator intbinaryoperator=(x,y)->Math.max(x,y);
        System.out.println("Maximum of Given Two Number : "+intbinaryoperator.applyAsInt(num1,num2));
    }
}
