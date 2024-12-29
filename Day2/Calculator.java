import java.io.*;
import java.util.*;
class Calculator {
    public int add(int a,int b) 
    {
        return a+b;
    }
    public double add(double a,double b) {
        return a+b;
    }
    public int add(int[] numbers) 
    {
        int sum=0;
        for (int i=0;i<numbers.length;i++) 
        {
            sum+=numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        Calculator calc=new Calculator();
        System.out.print("Enter the first integer: ");
        int num1=obj.nextInt();
        System.out.print("Enter the second integer: ");
        int num2=obj.nextInt();
        System.out.println("Sum of integers: "+calc.add(num1,num2));

        System.out.print("Enter the first double: ");
        double num3=obj.nextDouble();
        System.out.print("Enter the second double: ");
        double num4=obj.nextDouble();
        System.out.println("Sum of doubles: "+calc.add(num3,num4));

        System.out.print("Enter the size of the array: ");
        int size=obj.nextInt();
        int[] numbers=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++) 
        {
            System.out.print("Element "+(i+1)+": ");
            numbers[i]=obj.nextInt();
        }
        System.out.println("Sum of array: "+calc.add(numbers));
    }
}
