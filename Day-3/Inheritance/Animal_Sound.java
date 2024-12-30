import java.io.*;
import java.util.*;
class Animal 
{
    public void speak() 
    {
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal 
{
    @Override
    public void speak() 
    {
        System.out.println("Barks.");
    }
}

class Cat extends Animal 
{
    @Override
    public void speak() 
    {
        System.out.println("Meow.");
    }
}
public class Animal_Sound
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String choice=obj.nextLine().toLowerCase();
        Animal animal;
        switch (choice) 
        {
            case "dog":
                animal=new Dog();
                break;
            case "cat":
                animal=new Cat();
                break;
            default:
                animal=new Animal();
        }
        animal.speak();
    }
}
