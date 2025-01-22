import java.util.Optional;
import java.util.Scanner;

public class OptionalToProvideaDefaultValue {
    public static void main(String args[])
    {
        String str[]={"Hariharasuthan","Mohanraj","Nagul",null};
        for(int i=0;i<str.length;i++)
        {
            Optional<String> optional=Optional.ofNullable(str[i]);
            String str1=optional.orElse("Guest");
            System.out.println(str1);
        }
    }
}
