import java.io.*;
import java.util.*;
class Shape 
{
    public double area() 
    {
        throw new UnsupportedOperationException("Subclasses must implement this method.");
    }
}
class Rectangle extends Shape 
{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) 
    {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double area() 
    {
        return length*breadth;
    }
}
class Square extends Rectangle 
{
    public Square(double side) 
    {
        super(side,side);
    }
}
public class Shapes{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length=obj.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth=obj.nextDouble();
        Rectangle rectangle=new Rectangle(length, breadth);
        System.out.println("Rectangle area: "+rectangle.area());
        System.out.print("Enter the side of the square: ");
        double side=obj.nextDouble();
        Square square=new Square(side);
        System.out.println("Square area: "+square.area());
    }
}
