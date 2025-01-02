package otherpackage;
import Access_Modifiers.Person;
public class TestAccess {
    public static void main(String[] args)
    {
        Person person=new Person("John Doe",30,"123 Main St",50000);
        System.out.println("Name: "+person.name);
        System.out.println("Salary (via getter): "+person.getSalary());
    }
}