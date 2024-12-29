import java.io.*;
import java.util.*;
class reverse_a_number
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
    }
}