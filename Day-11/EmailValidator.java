import java.util.*;
public class EmailValidator {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String emailregex="^[a-zA-Z0-9._-][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net|in)$";
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Select an Option ");
        System.out.println("1.Add");
        System.out.println("2.Validate and Display");
        System.out.println("3.Exit");
        boolean status=true;
        while(status) {
            System.out.println("Enter Your Choice");
            int option = obj.nextInt();
            switch (option) {
                case 1:
                    String str = obj.next();
                    list.add(str);
                    break;
                case 2:
                    for(int i=0;i<list.size();i++) {
                        String email = list.get(i);
                        if (email.matches(emailregex)) {
                            System.out.println(email + " It is Valid Email ID");
                        } else {
                            System.out.println(email + " It is InValid Email ID");
                        }
                    }
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Enter a Valid Choice");
            }
        }
    }
}
