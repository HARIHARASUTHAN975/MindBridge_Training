import java.io.*;
import java.util.*;
class Shape {
    public double area(double length, double breadth) 
    {
        return length*breadth;
    }
    public double area(double radius) 
    {
        return Math.PI*radius*radius;
    }
    public double area(double base, double height, boolean isTriangle) 
    {
        return (base*height)/2;
    }
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        
        Shape shape = new Shape();

        System.out.println("Area of rectangle: " + shape.area(num1,num2));

        int num3=obj.nextInt();
        System.out.println("Area of circle: " + shape.area(num3));

        int base=obj.nextInt();
        int height=obj.nextInt();
        System.out.println("Area of triangle: " + shape.area(base,height,true));
    }
}