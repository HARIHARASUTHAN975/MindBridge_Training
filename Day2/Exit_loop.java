import java.io.*;
import java.util.*;
class Exit_loop
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num;
        while(true)
        {
            num=obj.nextInt();
            if(num==0)
                break;
        }
            System.out.println("THE LOOP GET EXITED");
    }
}