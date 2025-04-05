// Base class (Grandparent) - Electronics
class Electronics {
    protected String manufacturer;

    public Electronics(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        System.out.println("Electronics device turned on.");
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
    }
}

// Intermediate class (Parent) - Computer, inheriting from Electronics
class Computer extends Electronics {
    protected String operatingSystem;

    public Computer(String manufacturer, String operatingSystem) {
        super(manufacturer);
        this.operatingSystem = operatingSystem;
    }

    public void runProgram() {
        System.out.println("Computer is running a program.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class's displayInfo
        System.out.println("Operating System: " + operatingSystem);
    }
}

// Derived class (Child) - Laptop, inheriting from Computer
class Laptop extends Computer {
    private double screenSize;

    public Laptop(String manufacturer, String operatingSystem, double screenSize) {
        super(manufacturer, operatingSystem);
        this.screenSize = screenSize;
    }

    public void portableUse() {
        System.out.println("Laptop is being used portably.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class's displayInfo
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

public class MultilevelInheritanceExample2 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "Windows 10", 15.6);

        myLaptop.turnOn();
        myLaptop.runProgram();
        myLaptop.portableUse();
        myLaptop.displayInfo();
    }
}