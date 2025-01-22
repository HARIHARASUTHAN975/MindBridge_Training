import java.util.Scanner;
import java.util.function.BiFunction;

public class StringComparisionUsingInstanceMethod {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The String Separated by Comma(,)");
        String[] str=obj.nextLine().split(",");
        BiFunction<String,String,Integer> bifunc=String::compareToIgnoreCase;
        if(bifunc.apply(str[0],str[1])==0)
        {
            System.out.println("Both the Strings are Same");
        }
        else {
            System.out.println("Both the Strings are Different.");
        }
    }
}
