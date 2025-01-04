import java.util.*;
class MyClass
{
    String name;
    MyClass(String name)
    {
        this.name=name;
    }
    @Override
    public String toString() {
        return "MyClass{name='"+name+"'}";
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Scanner objs=new Scanner(System.in);
        String userInput=objs.nextLine();
        MyClass obj=new MyClass(userInput);
        System.out.println("Class of obj: "+obj.getClass());
        System.out.println("String representation of obj: "+obj.toString());
    }
}