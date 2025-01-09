import java.util.*;

public class ManageStudentsNames
{
    public static void main(String [] srgs)
    {
        Scanner obj=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        int num_of_entries=obj.nextInt();
       for(int i=0;i<num_of_entries;i++)
        {
         String name=obj.next();
         obj.nextLine();
         int num=obj.nextInt();
         map.put(name,num);
        }
       System.out.print("Enter Name to Update Thhe Mark : ");
       String name1=obj.next();
       System.out.print("Enter The Mark to Update");
       int num1=obj.nextInt();
        map.put(name1,num1);

        System.out.println("Alice Grade : "+map.get("Alice"));
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
    }
}
