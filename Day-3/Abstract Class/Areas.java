import java.io.*;
import java.util.*;
abstract class Shape 
{
    public abstract double calculateArea();
}
class Circle extends Shape 
{
    private double radius;
    public Circle(double radius) 
    {
        this.radius=radius;
    }
    @Override
    public double calculateArea() 
    {
        return Math.PI*radius*radius;
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
    public double calculateArea() {
        return length*breadth;
    }
}
public class Areas {
    public static void main(String[] args) {
        Shape circle=new Circle(5);
        System.out.println("Area of Circle: "+circle.calculateArea());
        Shape rectangle=new Rectangle(10, 5);
        System.out.println("Area of Rectangle: "+rectangle.calculateArea());
    }
}
