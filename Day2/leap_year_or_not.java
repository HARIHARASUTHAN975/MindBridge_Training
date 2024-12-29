import java.io.*;
import java.util.*;
class leap_year_or_not
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        boolean isleap=false;
        if((year%4==0 && year%100!=0)|| (year %400 ==0))
        {
            isleap=true;
        }
        else
        {
            isleap=false;
        }
        if(isleap)
        {
            System.out.println(year +" is a Leap year");
        }
        else{
            System.out.println(year+" is Not a Leap Year");
        }
    }
}