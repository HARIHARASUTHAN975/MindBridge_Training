import java.util.Scanner;
import java.util.function.UnaryOperator;

public class UnaryOperatorToConvertTheStringToUpperCase {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str=obj.nextLine();
        UnaryOperator<String> unaryoperator=(str1)->str1.toUpperCase();
        System.out.println("The Converted UpperCase String is : "+unaryoperator.apply(str));
    }
}
