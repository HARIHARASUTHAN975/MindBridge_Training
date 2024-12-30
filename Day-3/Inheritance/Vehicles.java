import java.io.*;
import java.util.*;
class Vehicle 
{
    public void start() 
    {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle 
{
    @Override
    public void start() 
    {
        System.out.println("Car is starting with ignition...");
    }
}
public class Vehicles {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Choose a vehicle to start:");
        System.out.println("1. Vehicle");
        System.out.println("2. Car");
        System.out.print("Enter your choice: ");
        int choice=obj.nextInt();
        Vehicle vehicle;
        if(choice==1) 
        {
            vehicle=new Vehicle();
        } 
        else if(choice==2) 
        {
            vehicle=new Car();
        }
        else 
        {
            System.out.println("Invalid choice!");
            return;
        }
        vehicle.start();
    }
}