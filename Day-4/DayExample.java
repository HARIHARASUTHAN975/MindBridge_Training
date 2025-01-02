import java.util.*;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class DayExample
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input=obj.nextLine().toUpperCase();
        try
        {
            Day day=Day.valueOf(input);
            switch(day)
            {
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's a weekend.");
                    break;
                default:
                    System.out.println("It's a weekday.");
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid day entered. Please try again.");
        }
    }
}
