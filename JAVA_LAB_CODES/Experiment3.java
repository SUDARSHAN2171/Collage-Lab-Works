import java.util.Scanner;

public class Experiment3 {
    // Inner class representing an Employee
    public static class Employee {
        // Instance variables
        private String name;
        private int age;
        private double salary;

        // Constructor to initialize instance variables
        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            this.age = age;
        }

        // Getter method for salary
        public double getSalary() {
            return salary;
        }

        // Setter method for salary
        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Method to raise the salary by 10%
        public void raiseSalary() {
            this.salary += this.salary * 0.10;
        }
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.println("Enter the employee's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the employee's age:");
        int age = scanner.nextInt();

        System.out.println("Enter the employee's salary:");
        double salary = scanner.nextDouble();

        // Creating an Employee object with user input
        Employee emp = new Employee(name, age, salary);

        // Displaying initial details
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

        // Raising salary by 10%
        emp.raiseSalary();

        // Displaying updated details
        System.out.println("\nName: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("After 10% raise:");
        System.out.println("Salary: " + emp.getSalary());

        // Closing the scanner
        scanner.close();
    }
}
