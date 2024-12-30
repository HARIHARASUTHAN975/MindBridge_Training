import java.io.*;
import java.util.*;
class Calculator 
{
    public int add(int a,int b) 
    {
        return a+b;
    }
    public double add(double a,double b) 
    {
        return a+b;
    }
    public int add(int a,int b,int c) 
    {
        return a+b+c;
    }
}
public class Calculators
{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.3));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
    }
}
