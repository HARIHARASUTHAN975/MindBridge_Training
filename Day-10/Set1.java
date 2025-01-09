import java.util.*;
public class Set1
{
    public static void main(String[] args)
    {
        Set<String> uniqueNames=new HashSet<>();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Names : ");
        while(true)
        {
            String name=obj.nextLine();
            if(name.equalsIgnoreCase("done"))
            {
                break;
            }
            if(uniqueNames.contains(name))
            {
                System.out.println(name+" is already present in the set.");
            }
            else
            {
                uniqueNames.add(name);
                System.out.println(name+" added to the set.");
            }
        }
        System.out.println("Unique Names are : "+uniqueNames);
    }
}