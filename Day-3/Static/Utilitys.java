import java.io.*;
import java.util.*;
class Utility {
    public static String convertToUpper(String str) 
    {
        return str.toUpperCase();
    }
}
public class Utilitys {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string to convert to uppercase: ");
        String input=obj.nextLine();
        String upperCaseString=Utility.convertToUpper(input);
        System.out.println("Uppercase: "+upperCaseString);

    }
}
