import java.util.*;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class StaticMethodToFIndSquareRoot {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.print("Enter the Size Of Numbers : ");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.print("Enter the "+i+" Number : ");
            list.add(obj.nextInt());
        }
        DoubleFunction<Double> doublefunction=StaticMethodToFIndSquareRoot::Square;
        list.forEach(i->{
            System.out.println("Square Root of "+i+" is "+doublefunction.apply(i));
        });


    }
    public static Double Square(Double d)
    {
        return Math.sqrt(d);
    }
}
