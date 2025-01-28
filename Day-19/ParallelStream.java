import java.util.*;
public class ParallelStream
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.print("Enter Size of Element : ");
        int size=obj.nextInt();
        for(int i=1;i<=size;i++)
        {
            System.out.print("Enter Number "+i+" : ");
            list.add(obj.nextInt());
        }
        list.stream().parallel().filter(num->num>50).map(num->num*num).limit(10).forEach(System.out::println);
    }
}
