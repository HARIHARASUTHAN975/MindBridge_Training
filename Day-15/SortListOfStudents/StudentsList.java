package SortListOfStudents;
public class StudentsList {
    String name;
    double gpa;
    public StudentsList(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return name+" : "+gpa;
    }
}