import java.util.*;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Viva1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Shape rect = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle: " + rect.getArea());

        System.out.println("Base and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Shape tri = new Triangle(base, height);
        System.out.println("Area of Triangle: " + tri.getArea());

        System.out.println("Radius of the circle:");
        double radius = sc.nextDouble();
        Shape cir = new Circle(radius);
        System.out.println("Area of Circle: " + cir.getArea());

        sc.close();
    }
}
