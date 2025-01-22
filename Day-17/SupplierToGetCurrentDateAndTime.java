import java.util.Calendar;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierToGetCurrentDateAndTime {
    public static void main(String args[])
    {
        Supplier<Calendar> supplier=()->Calendar.getInstance();
        System.out.println("Current  Date and Time is : "+supplier.get().getTime());

    }
}
