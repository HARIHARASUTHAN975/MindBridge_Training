package Stream_Practice_problems;
import java.util.*;
import java.util.stream.Collectors;
public class Student_Data {
    private String name;
    private String department;
    private int[] marks;
    Student_Data(String name, String department, int[] marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public double getAverageMark() {
        return Arrays.stream(marks).average().orElse(0.0);
    }
    public String getGrade()
    {
        double averagemark = getAverageMark();
        if(averagemark >=90)
            return "A";
        else if(averagemark >=80)
            return "B";
        else if (averagemark >=70)
            return "C";
        else
            return "D";
    }
    @Override
    public String toString() {
        return "Name=" + name + ", Department=" + department +", AverageMark=" + getAverageMark()+", Grade=" + getGrade() ;
    }
}
class Main6
{
    public static void main(String[] args)
    {
        List<Student_Data> students = new ArrayList<Student_Data>();
        students.add(new Student_Data("John", "Computer Science ", new int[]{88, 92, 74, 98, 78}));
        students.add(new Student_Data("Mohan", "Mathematics", new int[]{70, 78, 88, 70, 45}));
        students.add(new Student_Data("Shanmugapriyan", "Physics", new int[]{40, 45, 50, 58, 72}));
        students.add(new Student_Data("Nagul", "Physics", new int[]{99,92, 90, 93, 95}));
        students.add(new Student_Data("Kumar", "Mathematics", new int[]{32, 32, 40, 45, 52}));
        students.add(new Student_Data("Naveen", "Physics", new int[]{68, 64, 70, 78, 80}));
        students.add(new Student_Data("Tamil", "Computer Science", new int[]{70, 72, 78, 74, 71}));
        students.add(new Student_Data("Pravin", "Mathematics", new int[]{55, 60, 65, 68, 72}));
        students.add(new Student_Data("Kavin", "Physics", new int[]{53, 56, 62, 64, 69}));
        students.add(new Student_Data("Vishal", "Mathematics", new int[]{91,83, 85, 84, 75}));
        System.out.println("Top 3 Students based on Average Marks:");
        TopGrade(students);
        System.out.println();
        System.out.println("Grade for student based on Average Mark:");
        GradeAllocation(students);
        System.out.println();
        System.out.println("Average marks for each department:");
        AverageMark(students);
        System.out.println();
        System.out.println("Top student in each Department:");
        TopperStudents(students);
        System.out.println();
        System.out.println("Count of students failed in each Department:");
        Fail_count(students);
    }
    public static void TopGrade(List<Student_Data> students)
    {
        students.stream()
                .sorted(Comparator.comparing(Student_Data::getAverageMark).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
    public static void GradeAllocation(List<Student_Data> students)
    {
        students.forEach(student -> {System.out.println(student +" : "+student.getGrade());});
    }
    public static void AverageMark(List<Student_Data> students)
    {
        students.stream()
                .collect(Collectors.groupingBy(Student_Data::getDepartment
                        ,Collectors.averagingDouble(Student_Data::getAverageMark)))
                .forEach((department, marks) -> {System.out.println(department +" : "+marks);});
    }
    public static void TopperStudents(List<Student_Data> students) {
        students.stream()
                .collect(Collectors.groupingBy(Student_Data::getDepartment))
                .forEach((department,studentList)->
                {
                    Student_Data topStudent=studentList.stream().max(Comparator.comparingDouble(Student_Data::getAverageMark)).orElse(null) ;
                    System.out.println(department+" : "+topStudent.getName()+" : "+topStudent.getGrade());
                });
    }
    public static void Fail_count(List<Student_Data> students)
    {
        students.stream()
                .collect(Collectors.groupingBy(Student_Data::getDepartment))
                .forEach((department,studentList)->{
                    long failstudent=studentList.stream().filter(student->student.getAverageMark()<50).count();
                    System.out.println(department+" : "+failstudent);
                });
    }
}