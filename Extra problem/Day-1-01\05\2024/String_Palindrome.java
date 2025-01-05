import java.util.*;
public class String_Palindrome
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println(Palindrome(str));
    }
    public static boolean Palindrome(String str)
    {
        int left=0,right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return isPalindrome(str,left+1,right)||isPalindrome(str,left,right-1);
            }
        }
        return true;
    }
    private static boolean isPalindrome(String str, int left, int right)
    {
        while (left<right) {
            if (str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}