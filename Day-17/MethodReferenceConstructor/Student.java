package MethodReferenceConstructor;

public class Student {
        String name;
        int marks;
        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
            System.out.println("New Student was added in the Object.");
            System.out.println();
        }

        @Override
        public String toString() {
            return name+" : "+marks;
        }
}
