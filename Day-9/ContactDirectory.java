import java.util.*;
public class ContactDirectory {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Hashtable<String,String>table=new Hashtable<>();
        System.out.print("Enter number of entries :");
        int count=obj.nextInt();
        for(int i=0;i<count;i++)
        {
            System.out.print("Enter Name: ");
            String name=obj.next().toLowerCase();
            System.out.print("Enter Number:");
            String num=obj.next();
            table.put(name,num);
        }
        System.out.println("Contact Directory:");
        Set<Map.Entry<String,String>>entry=table.entrySet();
        for(Map.Entry<String,String>i:entry)
        {
            System.out.println(i.getKey()+":"+i.getValue());
        }
        System.out.println("Enter Your Search");
        String search=obj.next();
        System.out.println("Search for "+search+":"+table.get(search));
        System.out.println("Enter Remove Contact:");
        String rem=obj.next().toLowerCase();
        table.remove(rem);
        System.out.println("After Removal:");
        for(Map.Entry<String,String> i:entry)
        {
            System.out.println(i.getKey()+":"+i.getValue());
        }
    }
}