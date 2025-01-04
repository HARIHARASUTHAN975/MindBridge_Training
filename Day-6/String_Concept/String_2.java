package String_Concept;

import java.util.Scanner;

public class String_2 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2=obj.nextLine();
        int comp=str1.compareTo(str2);
        if(comp<0)
        {
            System.out.println("The String 1 is lexicographically smaller than String 2");
        }
        else if(comp>0)
        {
            System.out.println("The String 1 is lexicographically Greater than String 2");
        }
        else {
            System.out.println("The Two STring are lexigraphically Equal.");
        }
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("The Two Strings are Equal");
        }
        else {
            System.out.println("The Two Strings are Not Equal");
        }
        String concate=str1+str2;
        System.out.println("Concated String is : "+concate);
    }
}
