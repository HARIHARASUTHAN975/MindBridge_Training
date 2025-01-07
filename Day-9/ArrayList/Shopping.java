package ArrayList;
import java.util.*;
public class Shopping {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        System.out.print("Enter The Product(Separated by space(_)) : ");
        String [] str=obj.nextLine().split(" ");
        int num=str.length;
        for(int i=0;i<num;i++)
        {
            list.add(str[i]);
        }
        System.out.println("Shopping Product List : "+list);
        System.out.print("Enter Item to remove : ");
        String removes=obj.next();
        list.remove(removes);
        System.out.println("After Removal of Product : ");
        System.out.println("Shopping Product List : "+list);
    }
}
