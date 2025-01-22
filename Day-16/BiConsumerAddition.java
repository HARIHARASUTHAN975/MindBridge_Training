import java.util.*;
import java.util.function.BiConsumer;

public class BiConsumerAddition {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = obj.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = obj.nextInt();
        BiConsumer<Integer, Integer> print = (x, y) -> System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
        print.accept(num1,num2);
    }
}

