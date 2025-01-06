package Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {
        public static void main(String[] args) {
            try {
                Class class1=Class.forName("Reflection.Person");
                Constructor constructors[]=class1.getDeclaredConstructors();
                System.out.println("Constructors:");
                for(int i=0;i<constructors.length;i++)
                {
                    System.out.println(constructors[i]);
                }
                Method method[]= class1.getDeclaredMethods();
                System.out.println("Methods:");
                for(int i=0;i<method.length;i++)
                {
                    System.out.println(method[i]);
                }
                Field field[]=class1.getDeclaredFields();
                System.out.println("Fields:");
                for(int i=0;i<field.length;i++)
                {
                    System.out.println(field[i]);
                }
                Person p1=(Person)constructors[0].newInstance("Hariharasuthan M","Erode");
                for(int i=0;i<method.length;i++)
                {
                    if(method[i].getName().indexOf("getDisplay")!=-1)
                    {
                        System.out.println("Person Details:");
                        method[i].setAccessible(true);
                        method[i].invoke(p1);
                    }
                }

            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
