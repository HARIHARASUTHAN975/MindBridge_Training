package Student_Management_System;

import java.util.Locale;

public class Student {
    private int ID;
    private String Name;
    private int Age;
    private char Grade;
    private String Emailid;

     public Student(int id,String name,int age,char grade,String EmailId)
    {
        ID=id;
        Name=name;
        Age=age;
        Grade=grade;
        Emailid=EmailId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    @Override
    public String toString()
    {
        return '\n'+"Student ID = "+ID +'\n'+"Name = "+Name+'\n'+"Age = "+Age+'\n'+"Grade = "+Grade +'\n'+"E=mail Id = "+Emailid;
    }
}