import java.io.*;
import java.util.*;
abstract class Appliance 
{
    public abstract void turnOn();
    public void turnOff() 
    {
        System.out.println("The appliance is turned off.");
    }
}
class Fan extends Appliance 
{
    @Override
    public void turnOn() 
    {
        System.out.println("The fan is turned on.");
    }
}
public class Appliances
{
    public static void main(String[] args) 
    {
        Appliance fan=new Fan();
        fan.turnOn();
        fan.turnOff();    
    }
}
