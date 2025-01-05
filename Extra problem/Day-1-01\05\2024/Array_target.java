import java.util.*;
public class Array_target {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        int target=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++) {
                if ((arr[i]+arr[j])==target) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
