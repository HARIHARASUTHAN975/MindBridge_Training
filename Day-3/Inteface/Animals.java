import java.io.*;
import java.util.*;
interface Animal 
{
    void eat();
    void sleep();
}
class Dog implements Animal 
{
    @Override
    public void eat() 
    {
        System.out.println("The dog is eating.");
    }
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }
   @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}
public class Animals{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();  
        dog.sleep();
        cat.eat();  
        cat.sleep(); 
    }
}
