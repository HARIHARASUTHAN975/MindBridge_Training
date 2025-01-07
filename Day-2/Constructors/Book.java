import java.io.*;
import java.util.*;
class Book 
{
    String title;
    String author;
    public Book() 
    {
        title="Unknown Title";
        author="Unknown Author";
    }
    public void displayDetails() 
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
    public static void main(String[] args) 
    {
        Book book=new Book();
        book.displayDetails();
    }
}
