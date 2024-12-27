import java.util.*;
public class Logical_Operator {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int number1=obj.nextInt();
        int number2=obj.nextInt();
        if(number1<number2)
        {
            System.out.println("Number 1 is less that Number 2");
        }
        else
        {
            System.out.println("Number 1 is Greater than Number 2 ");
        }
    }
}
