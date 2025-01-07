import java.util.*;
public class ArithmeticOperator {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        int add=num1+num2;
        int subraction=num1-num2;
        int muliple=num1*num2;
        float division=num1/num2;
        int modulus=num1%num2;
        System.out.println("Add Operator: "+add);
        System.out.println("SubractionOperator: "+subraction);
        System.out.println("Multiple Operator: "+muliple);
        System.out.println("Division Operator: "+division);
        System.out.println("Modulus Operator: "+modulus);
    }
}
