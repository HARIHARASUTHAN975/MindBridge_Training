import java.util.*;
public class Primitive_Type_Conversion
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Float value");
        float f1=obj.nextFloat();
        int n=(int)f1;
        System.out.println("FLOAT= " +f1);
        System.out.println("INT= "+n);
    }
}
