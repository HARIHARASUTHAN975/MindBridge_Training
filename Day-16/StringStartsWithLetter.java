import java.util.*;
import java.util.function.Predicate;

public class StringStartsWithLetter {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter thr Strings with Spaces(_)");
        String[] str=obj.nextLine().split(" ");
        List<String> list=new ArrayList<>();
        for(int i=0;i< str.length;i++)
        {
            list.add(str[i]);
        }
        System.out.println("Enter the Starting Letter");
        String str2=obj.nextLine().toUpperCase();
        StringStartWithLetter(list,str2,(m)->m.startsWith(str2));

    }
    public static void StringStartWithLetter(List<String> list, String str2, Predicate<String> p)
    {
        List<String> list2 = new ArrayList<>();
        list.forEach(i->{
            if(p.test(i))
                list2.add(i);
        });
        System.out.println(list2);
    }
}
