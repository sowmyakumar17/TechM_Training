package project;

import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    void calculateTotalAndAverage() {
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.length;
    }

    @Override
    public String toString() {
        return name + " - Total: " + total + ", Average: " + average;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();

            int[] marks = new int[subjects];
            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline

            students.add(new Student(name, marks));
        }

        // Sort students based on total marks in descending order
        students.sort((s1, s2) -> Integer.compare(s2.total, s1.total));

        System.out.println("\nStudents sorted by total marks:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
