public class Interface3 {
    public static void main(String[] args) {
        RemoteControl device;

        device = new TV();
        System.out.println("== TV ==");
        device.turnOn();
        device.turnOff();
        System.out.println();

        device = new Fan();
        System.out.println("== Fan ==");
        device.turnOn();
        device.turnOff();
        System.out.println();

        device = new AC();
        System.out.println("== AC ==");
        device.turnOn();
        device.turnOff();
    }
}
// TV implements RemoteControl
class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    public void turnOff() {
        System.out.println("TV is now OFF.");
    }
}

// Fan implements RemoteControl
class Fan implements RemoteControl {
    public void turnOn() {
        System.out.println("Fan is spinning now.");
    }

    public void turnOff() {
        System.out.println("Fan has stopped.");
    }
}

// AC implements RemoteControl
class AC implements RemoteControl {
    public void turnOn() {
        System.out.println("AC is cooling the room.");
    }

    public void turnOff() {
        System.out.println("AC is turned off.");
    }
}
// Interface for Remote Control
interface RemoteControl {
    void turnOn();
    void turnOff();
}
