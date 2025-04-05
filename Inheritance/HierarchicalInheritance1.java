// Base class (Parent) - Shape
class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }

    public double calculateArea() {
        return 0; // Default area for generic shape (to be overridden)
    }
}

// Derived class (Child 1) - Circle, inheriting from Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayCircleInfo() {
        displayColor();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

// Derived class (Child 2) - Rectangle, inheriting from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public void displayRectangleInfo() {
        displayColor();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Blue", 5.0);
        Rectangle myRectangle = new Rectangle("Red", 4.0, 6.0);

        myCircle.displayCircleInfo();
        System.out.println("------------------");
        myRectangle.displayRectangleInfo();
    }
}