package Java_Lang_Class;
import java.util.*;
public class Mathematical_operation {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        double num=obj.nextInt();
        double base_num=obj.nextInt();
        double exp_num=obj.nextInt();
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        System.out.println("Square Root of the Number "+num+" : "+Math.sqrt(num));
        System.out.println("The Power of the Number : "+Math.pow(base_num,exp_num));
        System.out.println("The Maximum Number is "+Math.max(num1,num2));
    }
}
