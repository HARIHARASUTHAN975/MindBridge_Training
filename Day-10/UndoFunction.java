import java.util.*;
public class UndoFunction {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        System.out.println("Stack Operation");
        System.out.println("1.Add");
        System.out.println("2.Undo");
        System.out.println("3.Display The value");
        System.out.println("4.Exit");
        boolean status=true;
        while(status)
        {
            System.out.println();
            System.out.print("Enter Your Choice : ");
            int option=obj.nextInt();
            switch(option)
            {
                case 1:
                    String str=obj.next();
                    stack.push(str);
                    break;
                case 2:
                    stack.pop();
                    System.out.println("Undo Processed");
                    break;
                case 3:
                    for(int i=0;i<stack.size();i++)
                        System.out.print(stack.get(i)+" ");
                    break;
                case 4:
                    status=false;
                    break;
                default:
                    System.out.println("Enter a Valid option");
            }

        }

    }
}
