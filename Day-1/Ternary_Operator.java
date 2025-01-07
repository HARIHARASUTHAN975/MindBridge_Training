import java.util.*;
public class Ternary_Operator {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        String result=(num%2==0)?"Even":"odd";
        System.out.println("The Number is : "+result);
    }
}
