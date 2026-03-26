package ConstructorPrograms;
import java.util.Scanner;

class Student {
    int id;
    String name;
    boolean isPresent;  // attendance

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.isPresent = false; // default absent
    }

    void markAttendance(boolean status) {
        this.isPresent = status;
    }

    void display() {
        String status = isPresent ? "Present" : "Absent";
        System.out.println("Student: " + name + " " + id + " - " + status);
    }
}

class Classroom {
    Student[] students;

    Classroom(Student[] students) {
        this.students = students;
    }

    void markAttendance() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.print("Is " + students[i].name + " present? (true/false): ");
            boolean status = sc.nextBoolean();
            students[i].markAttendance(status);
        }
    }

    void displayAttendance() {
        System.out.println("\nAttendance Report:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}

public class Attendence {
    public static void main(String[] args) {

        // Create 5 students (you can make 25)
        Student[] students = new Student[5];

        students[0] = new Student("A", 1);
        students[1] = new Student("B", 2);
        students[2] = new Student("C", 3);
        students[3] = new Student("D", 4);
        students[4] = new Student("E", 5);

        Classroom c1 = new Classroom(students);

        // Mark attendance
        c1.markAttendance();

        // Display report
        c1.displayAttendance();
        
    }
}