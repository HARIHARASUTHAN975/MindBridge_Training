import java.util.*;
import java.util.function.IntPredicate;

public class FilterEvenNumbers {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Size of Number ");
        int num=obj.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=num;i++)
        {
            System.out.print("Enter the Number "+i+": ");
            list.add(obj.nextInt());
        }
        EvenNumberCheck(list,(m)->m%2==0);

    }
    public static void EvenNumberCheck(List<Integer> list, IntPredicate intpredicate)
    {
        List<Integer> list2=new ArrayList<>();
        list.forEach(l->
        {
            if(intpredicate.test(l))
            {
                list2.add(l);
            }
        });
        if(list2.size()==0)
        {
            System.out.println("There is no even element found on the list");
        }
        else {
        System.out.println(list2);
        }
    }


}
