// Main class
public class HybridInheritanceVehicle {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model 3");

        myCar.startEngine();     
        myCar.showModel();       
        myCar.chargeBattery();   
        myCar.navigate();        
    }
}
// Base class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

// Interface 1
interface Electric {
    void chargeBattery();
}

// Interface 2
interface GPS {
    void navigate();
}

// Derived class using hybrid inheritance
class Car extends Vehicle implements Electric, GPS {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
    public void chargeBattery() {
        System.out.println("Charging the car battery...");
    }
    public void navigate() {
        System.out.println("Navigating to destination using GPS.");
    }
}

