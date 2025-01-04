package String_Concept;
import java.util.*;
public class String_1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int wordcount=count(str);
        System.out.println("No of Words : "+wordcount);
        String rev=reverse(str);
        System.out.println("Reversed STring : "+rev);
        String vowel_replace=replace_vowels(str);
        System.out.println(vowel_replace);
    }
    public static int count(String str)
    {
        String[] word=str.split(" ");
        return word.length;
    }
    public static String reverse(String str)
    {
        String revs="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revs+=str.charAt(i);
        }
        return revs;
    }
    public static String replace_vowels(String str)
    {
        String res="";
        for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                res+='*';
            }
            else {
                res += ch;
            }
        }
        return res;
    }
}
