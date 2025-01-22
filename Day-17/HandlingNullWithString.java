import java.util.Optional;
import java.util.Scanner;

public class HandlingNullWithString {
    public static void main(String args[])
    {
        String str[]={"Hariharasuthan","Kalai",null};
        for(int i=0;i<str.length;i++)
        {
            Optional<String> optional =Optional.ofNullable(str[i]);
            if(optional.isPresent())
            {
                System.out.println("The UpperCase of the String is : "+optional.get().toUpperCase());

            }
            else {
                System.out.println("Empty Input");
            }
        }

    }
}
