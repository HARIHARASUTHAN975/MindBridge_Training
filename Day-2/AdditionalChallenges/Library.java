import java.util.*;
class Personal_Details 
{
    double id;
    String name;
    public Personal_Details(double id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void MemberDetails()
    {
        System.out.println("Member Details");
        System.out.println("Id:"+id);
        System.out.println("Name:"+ name);
    }
}

class Book {
    public void Showbook()
    {
        System.out.println("Books Available Categories are");
        System.out.println("Astrology");
        System.out.println("Journals");
        System.out.println("Novels");
        System.out.println("Poetry");
        System.out.println("Comics");
    }
}
class Librarian {
    String bkname;
    double id;
    public Librarian(String bkname,double id)
    {
        this.bkname=bkname;
        this.id=id;
    }
    public void ShowDetails(){
        System.out.println("Book Borrowed Details");
        System.out.println("Id:"+id);
        System.out.println("BookName:"+bkname);
    }
}
public class Library {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        System.out.println("Give Register Number:");
        double id=o.nextDouble();
        o.nextLine();
        System.out.println("Give Your Name:");
        String name=o.nextLine();
        Personal_Details mem=new Personal_Details(id,name);
        mem.MemberDetails();
        Book book=new Book();
        book.Showbook();
        System.out.println("Enter Book Name:");
        String bkname=o.nextLine();
        Librarian lib=new Librarian(bkname,id);
        lib.ShowDetails();
    }
}