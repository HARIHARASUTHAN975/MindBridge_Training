import java.util.*;
public class N_chips {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String[] str=obj.nextLine().split(" ");
        int[] pos=new int[str.length];
        for(int i=0;i< str.length;i++)
        {
            pos[i]=Integer.parseInt(str[i]);
        }
        int even=0;
        int odd=0;
        for(int i=0;i< str.length;i++)
        {
            if(pos[i]%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println(Math.min(even,odd));
    }
}
