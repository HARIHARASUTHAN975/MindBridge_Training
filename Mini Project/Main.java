package Student_Management_System;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final String FILE_NAME = "student.txt";
    public static char GradeGenerator(int average)
    {
        if(average>=90) {
            return 'A';
        }
        else if(average>=80 && average<90) {
            return 'B';
        }
        else if(average>=70 && average<80) {
            return 'C';
        }
        else if(average>=60 && average<70) {
            return 'D';
        }
        else {
            return 'U';
        }
    }


    public static void searchStudents(Map<Integer, Student> data, int searchChoice) {
        Scanner obj = new Scanner(System.in);
        List<Student> filteredList = new ArrayList<>();

        switch (searchChoice) {
            case 1:
                System.out.print("Enter Grade (A, B, C, D, U) to filter students: ");
                char gradeFilter = obj.next().charAt(0);
                filteredList = data.values().stream()
                        .filter(student -> student.getGrade() == gradeFilter)
                        .collect(Collectors.toList());
                System.out.println("Students with Grade " + gradeFilter + ":");
                break;

            case 2:
                System.out.print("Enter Minimum Age: ");
                int minAge = obj.nextInt();
                System.out.print("Enter Maximum Age: ");
                int maxAge = obj.nextInt();
                filteredList = data.values().stream()
                        .filter(student -> student.getAge() >= minAge && student.getAge() <= maxAge)
                        .collect(Collectors.toList());
                System.out.println("Students between ages " + minAge + " and " + maxAge + ":");
                break;

            default:
                System.out.println("Invalid search choice!");
                return;
        }
    }

    public static boolean EmailValidator(String emailId)
    {
        String emailregex="^[a-zA-Z0-9._-][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net|in)$";
        if (emailId.matches(emailregex)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void saveStudentsToFile(Map<Integer, Student> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            for (Student student : data.values()) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }
    public static HashMap<Integer, Student> loadStudentsFromFile() {
        HashMap<Integer, Student> data = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int age = Integer.parseInt(parts[2].trim());
                    char grade = parts[3].trim().charAt(0);
                    String email = parts[4].trim();
                    data.put(id, new Student(id, name, age, grade, email));
                }
            }
        } catch (IOException e) {
            System.out.println("No existing student data found.");
        }
        return data;
    }

    public static void main(String args[])
    {

        HashMap<Integer,Student>data =loadStudentsFromFile();
        Scanner obj=new Scanner(System.in);
        boolean Boolean1=true;
        while(Boolean1) {

            System.out.println("------------------------------------------");
            System.out.println("|        STUDENT MANAGEMENT SYSTEM       |");
            System.out.println("|----------------------------------------|");
            System.out.println("| 1.Add New Student                      |");
            System.out.println("| 2.View All Student                     |");
            System.out.println("| 3.Search student                       |");
            System.out.println("| 4.Update Student Details               |");
            System.out.println("| 5.Delete Student Records               |");
            System.out.println("| 6.Store the Data in a File             |");
            System.out.println("| 7.Retrieve the Data in a File          |");
            System.out.println("| 8.Sort The Student Via Age or Grade    |");
            System.out.println("| 9.Exit the Process                    |");
            System.out.println("------------------------------------------");
            System.out.print("Enter Your Choice : ");
            int choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter The Student ID : ");
                    int id = obj.nextInt();
                    if (data.containsKey(id)) {
                        System.out.println("The ID is Already Exist");
                        System.out.println("Enter the Valid ID ...");
                        id = obj.nextInt();
                    }
                    System.out.print("Enter Student Name : ");
                    String name = obj.next();
                    System.out.print("Enter the Age of Student : ");
                    int age = obj.nextInt();
                    System.out.print("Enter Total Number Subject : ");
                    int size = obj.nextInt();
                    int total = 0;
                    int average = 0;
                    char grade = ' ';
                    for (int i = 1; i <= size; i++) {
                        System.out.print("Enter " + i + " Mark : ");
                        total += obj.nextInt();
                        average = total / size;
                        grade = GradeGenerator(average);
                    }
                    System.out.print("Enter Student MailId : ");
                    String mailid = obj.next();
                    if (EmailValidator(mailid)) {
                        data.put(id, new Student(id, name, age, grade, mailid));
                        System.out.println("Student " + name + " Added Succesfully");
                    } else {
                        System.out.println("Enter a Valid Email ID( Example : example123@gmail.com)");
                    }


                    break;
                case 2:
                    System.out.println("All Student Data In the List : ");
                    System.out.println("-----------------------------");
                    System.out.println();
                    final int[] i = {1};
                    data.forEach((integer, student) -> System.out.println("Student " + (i[0]++) + ":" + student.toString()));
                    break;
                case 3:
                    System.out.println("Enter Student ID to Search Details ");
                    int searchID = obj.nextInt();
                    boolean Boolean2 = true;
                    while (Boolean2) {
                        System.out.println("Search Result :");
                        if (data.containsKey(searchID)) {
                            System.out.print("Student Details :");
                            System.out.println(data.get(searchID).toString());
                            Boolean2 = false;
                        } else {
                            System.out.println("Student Id is Not Present.");
                            System.out.println("Enter Valid Student Id :");
                            searchID = obj.nextInt();
                        }
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("---------------------------------");
                    System.out.println("|     STUDENT DATA UPDATION     |");
                    System.out.println("---------------------------------");
                    System.out.println("| 1.Update Student Name         |");
                    System.out.println("| 2.Update Student Age          |");
                    System.out.println("| 3.Update Student MArks        |");
                    System.out.println("| 4.Update Student Email-ID     |");
                    System.out.println("| 5.Exit the Process            |");
                    System.out.println("---------------------------------");
                    System.out.print("Enter Student Id :");
                    int upid = obj.nextInt();
                    boolean Boolean3 = true;
                    while (Boolean3) {
                        if (data.containsKey(upid))
                            Boolean3 = false;
                        else {
                            System.out.print("Enter Valid Student id :");
                            upid = obj.nextInt();
                        }
                    }
                    boolean Boolean4 = true;
                    while (Boolean4) {
                        System.out.print("Enter Your Choice : ");
                        int choice2 = obj.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.print("Enter Student Name to Update : ");
                                String updatename = obj.next();
                                data.computeIfPresent(upid, (k, v) -> {
                                    v.setName(updatename);
                                    return v;
                                });
                                System.out.println("Name was Get Updated");
                                System.out.println();
                                break;
                            case 2:
                                obj.nextLine();
                                System.out.print("Enter Student Age to Update : ");
                                int updateAge = obj.nextInt();
                                data.computeIfPresent(upid, (k, v) -> {
                                    v.setAge(updateAge);
                                    return v;
                                });
                                System.out.println("Age was Get Updated");
                                System.out.println();
                                break;
                            case 3:
                                System.out.print("Enter Total Number Subject : ");
                                int updatedsize = obj.nextInt();
                                int updatedtotal = 0;
                                int updatedaverage = 0;
                                for (int j = 1; j <= updatedsize; j++) {
                                    System.out.print("Enter Subject " + j + " Mark : ");
                                    updatedtotal += obj.nextInt();
                                    updatedaverage = updatedtotal / updatedsize;
                                    char UpdateGrade = GradeGenerator(updatedaverage);
                                    data.computeIfPresent(upid, (k, v) -> {
                                        v.setGrade(UpdateGrade);
                                        return v;
                                    });
                                }
                                System.out.println("Grade was Get Updated");
                                System.out.println();
                                break;
                            case 4:
                                System.out.print("Enter Student Email-ID to Update :");
                                String updatedEmailid = obj.next();
                                data.computeIfPresent(upid, (k, v) -> {
                                    v.setEmailid(updatedEmailid);
                                    return v;
                                });
                                System.out.println("Email-ID was Get Updated");
                                System.out.println();
                                break;
                            case 5:
                                Boolean4 = false;
                                System.out.println("Exited........");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter Student ID to Delete the Student Details");
                    int DeleteDetailId = obj.nextInt();
                    if (data.containsKey(DeleteDetailId))
                        data.remove(DeleteDetailId);
                    System.out.println("Student Removed Successfully");
                    break;

                case 6:
                    try {
                        saveStudentsToFile(data);
                        System.out.println("Data stored successfully!");
                    } catch (IOException e) {
                        System.out.println("Error saving data: " + e.getMessage());
                    }
                    break;
                case 7:
                    data = loadStudentsFromFile();
                    System.out.println("Data retrieved successfully!");
                    break;

                case 8:
                    System.out.println("-----------------------------------");
                    System.out.println("|  SORT STUDENT VIA GRADE OR AGE  |");
                    System.out.println("----------------------------------");
                    System.out.println("| 1.Sort Via Grade                |");
                    System.out.println("| 2.Sort Via Student Age          |");
                    System.out.println("-----------------------------------");
                    System.out.print("Enter Your Choice ");
                    int searchChoice=obj.nextInt();
                    switch (searchChoice) {
                        case 1:
                            List<Student> filteredList = new ArrayList<>();
                            System.out.print("Enter Grade (A, B, C, D, U) to filter students: ");
                            char gradeFilter = obj.next().charAt(0);
                            filteredList = data.values().stream()
                                    .filter(student -> student.getGrade() == gradeFilter)
                                    .collect(Collectors.toList());
                            System.out.println("Students with Grade " + gradeFilter + ":");
                            break;
                        case 2:
                            System.out.print("Enter Minimum Age: ");
                            int minAge = obj.nextInt();
                            System.out.print("Enter Maximum Age: ");
                            int maxAge = obj.nextInt();
                            filteredList = data.values().stream()
                                    .filter(student -> student.getAge() >= minAge && student.getAge() <= maxAge)
                                    .collect(Collectors.toList());
                            System.out.println("Students between ages " + minAge + " and " + maxAge + ":");
                            break;

                        default:
                            System.out.println("Invalid search choice!");
                            return;
                    }
                    case 9:
                        System.out.println("Exited.....");
                        Boolean1=false;
                        break;
                    default:
                        System.out.println("Enter a Valid Choice.....");
                        break;
            }
        }
    }
}