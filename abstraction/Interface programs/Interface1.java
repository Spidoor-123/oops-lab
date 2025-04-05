
public class Interface1{
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(4);
        System.out.println("Circle");
        shape.area();
        shape.perimeter();
        System.out.println();

        shape = new Rectangle(4, 6);
        System.out.println("Rectangle");
        shape.area();
        shape.perimeter();
        System.out.println();

        shape = new Square(4);
        System.out.println("Square ");
        shape.area();
        shape.perimeter();
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter: " + perimeter);
    }
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Square implements Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public void area() {
        System.out.println("Square Area: " + (side * side));
    }
    public void perimeter() {
        System.out.println("Square Perimeter: " + (4 * side));
    }
}
// Interface
interface Shape {
    void area();      
    void perimeter(); 
}
