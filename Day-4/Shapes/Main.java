package Shapes;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a Radius : ");
        double radius=obj.nextDouble();
        System.out.print("Enter a Length : ");
        double length=obj.nextDouble();
        System.out.print("Enter a Bredth : ");
        double bredth=obj.nextDouble();
        Circle circle=new Circle(radius);
        Rectangle rectangle=new Rectangle(length, bredth);
        System.out.println("Radius of Circle: "+circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
