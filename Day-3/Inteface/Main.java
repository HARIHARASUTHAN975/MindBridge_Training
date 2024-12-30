import java.io.*;
interface Constants {
    double PI=3.14;
}
class Circle implements Constants {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
