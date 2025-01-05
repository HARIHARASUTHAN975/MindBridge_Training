import java.util.*;
public class Sub_String_Sequence
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String sequence=obj.nextLine();
        String word=obj.nextLine();
        int k=0;
        String repeate=word;
        while (sequence.contains(repeate))
        {
            k++;
            repeate+=word;
        }
        System.out.println("The maximum k-repeating value is: "+k);
    }
}