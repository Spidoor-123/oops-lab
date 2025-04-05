public class Constructor_a {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.show();
        myCar.showCar();
    }
}

class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    public void show() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    public Car() {
        super(); // Calls Vehicle constructor
        System.out.println("Car constructor called");
    }

    public void showCar() {
        System.out.println("This is a car");
    }
}

