package Java_Lang_Class;
import java.util.*;
public class String_Operation {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println("The Length of String : "+str.length());
        System.out.println("The UpperCase of the String : "+str.toUpperCase());
        System.out.print("Enter the Number to find Subbstring with The Index Value : ");
        int index=obj.nextInt();
        if(index<=str.length()-1)
            System.out.println("Substring is :  "+str.substring(index));
        else
            System.out.println("THe Index Valus Should be less than The Size of String");
    }
}
