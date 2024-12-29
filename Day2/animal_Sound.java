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
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal 
{
    @Override
    public void speak() 
    {
        System.out.println("The cat meows.");
    }
}
public class animal_Sound
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.nextLine().toLowerCase();
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
        scanner.close();
    }
}
