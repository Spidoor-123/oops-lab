public class MethodOverloading_poly2_poly {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.displayInfo();
        vehicle.start();
        vehicle.fuelType();
        System.out.println();

        vehicle = new Bike();
        vehicle.displayInfo();
        vehicle.start();
        vehicle.fuelType();
        System.out.println();

        vehicle = new Truck();
        vehicle.displayInfo();
        vehicle.start();
        vehicle.fuelType();
    }
}
// Base class
class Vehicle {
    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void fuelType() {
        System.out.println("Generic fuel type.");
    }

    public void displayInfo() {
        System.out.println("This is a generic vehicle.");
    }
}

// Subclass: Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key or push button.");
    }
    public void fuelType() {
        System.out.println("Car uses petrol or diesel.");
    }
    public void displayInfo() {
        System.out.println("This is a Car.");
    }
}
class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike is starting with a self-start or kick.");
    }
    public void fuelType() {
        System.out.println("Bike uses petrol.");
    }
    public void displayInfo() {
        System.out.println("This is a Bike.");
    }
}
class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting with a heavy-duty ignition.");
    }
    public void fuelType() {
        System.out.println("Truck uses diesel.");
    }
    public void displayInfo() {
        System.out.println("This is a Truck.");
    }
}
