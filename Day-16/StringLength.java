import java.util.*;
import java.util.function.Function;
public class StringLength {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        System.out.println("Enter thr Strings with Spaces(_)");
        String[] str=obj.nextLine().split(" ");
        for(int i=0;i< str.length;i++)
        {
            list.add(str[i]);
        }
        Function<String,Integer> function=(s)-> s.length();
        List<Integer> list2=new ArrayList<>();
        list.forEach(i->{
            list2.add(function.apply(i));
        });
        System.out.println(list2);
    }
    }
