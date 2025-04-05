public class abstract2 {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.5);
        Shape rectangle = new Rectangle("Blue", 4.0, 7.0);
        Shape triangle = new Triangle("Green", 6.0, 8.0);

        System.out.println("== Circle ==");
        circle.displayColor();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\n== Rectangle ==");
        rectangle.displayColor();
        System.out.println("Area: " + rectangle.calculateArea());

        System.out.println("\n== Triangle ==");
        triangle.displayColor();
        System.out.println("Area: " + triangle.calculateArea());
    }
}

abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    
    abstract double calculateArea();

    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
