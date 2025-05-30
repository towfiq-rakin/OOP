/*
    1. Create a program to Calculate the area of different shapes using polymorphism.
        - Create base class shape with method name getArea()
        - Create derived classes Circle, Rectangle, And Triangle, each overriding the getArea() method.
        - In the main method, create an array of Shape objects and initialize them with different shapes.
        - Print the area of each shape using getArea() method.
*/
class Shape {
    public double getArea() {
        return 0.0; // Default implementation
    }

    public String getShapeType() {
        return null;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getShapeType() {
        return "Triangle";
    }
}
public class One {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 4);

        for (Shape s : shapes) {
            System.out.println("Area of " + s.getShapeType() + ": " + s.getArea());
        }
    }
}
