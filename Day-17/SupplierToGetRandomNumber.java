import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierToGetRandomNumber {
    public static void main(String args[])
    {
        Supplier<Integer> supplier=()->(int)(Math.random()*100);
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+".Random Number is : "+supplier.get());
        }
    }
}
