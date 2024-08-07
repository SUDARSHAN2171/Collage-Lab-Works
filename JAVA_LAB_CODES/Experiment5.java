
// Experiment5.java
import java.util.Scanner;

// Base class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    private String rollNumber;
    private String course;

    // Constructor
    public Student(String name, int age, String rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Getters
    public String getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    // Method to display student details
    public void displayStudentInfo() {
        // Display person info using parent class method
        displayPersonInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

// Main class
public class Experiment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Person
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input for Student
        System.out.println("Enter roll number:");
        String rollNumber = scanner.nextLine();
        System.out.println("Enter course:");
        String course = scanner.nextLine();

        // Create Student object
        Student student = new Student(name, age, rollNumber, course);

        // Display Student info
        System.out.println("\nStudent Information:");
        student.displayStudentInfo();

        scanner.close();
    }
}
