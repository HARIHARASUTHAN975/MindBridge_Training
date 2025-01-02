import java.util.Scanner;
enum Season
{
        WINTER,SPRING,SUMMER,FALL;
        public double getAverageTemperature()
        {
            switch(this)
            {
                case WINTER:
                    return 32.0;
                case SPRING:
                    return 60.0;
                case SUMMER:
                    return 85.0;
                case FALL:
                    return 55.0;
                default:
                    throw new IllegalStateException("Unexpected value: " + this);
            }
        }
    }
    public class SeasonExample
    {
        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter a season : ");
            String input=obj.nextLine().toUpperCase();
            try
            {
                Season season=Season.valueOf(input);
                System.out.println(season+": Average Temperature = "+season.getAverageTemperature()+"°F");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Invalid season entered. Please try again.");
            }
        }
    }