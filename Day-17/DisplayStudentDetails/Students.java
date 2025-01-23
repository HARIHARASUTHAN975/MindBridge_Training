package DisplayStudentDetails;

public class Students {
    String name;
    int marks;

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void displayStudentDetails(){
        System.out.println(name+" : "+marks);
    }
}
