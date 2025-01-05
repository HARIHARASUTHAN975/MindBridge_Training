import java.util.*;
public class String_count
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String[] str=obj.nextLine().split(" ");
        String word=obj.nextLine();
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            if(word.contains(str[i]))
            {
                count++;
            }
        }
        System.out.println("The Sub String are : "+count);
    }
}
