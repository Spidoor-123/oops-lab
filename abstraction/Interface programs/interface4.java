public class Interface4 {
    public static void main(String[] args) {
        Transport vehicle;

        vehicle = new Bus();
        System.out.println("== Bus ==");
        vehicle.move();
        vehicle.capacity();
        System.out.println();

        vehicle = new Train();
        System.out.println("== Train ==");
        vehicle.move();
        vehicle.capacity();
        System.out.println();

        vehicle = new Airplane();
        System.out.println("== Airplane ==");
        vehicle.move();
        vehicle.capacity();
    }
}
class Bus implements Transport {
    public void move() {
        System.out.println("Bus moves on roads.");
    }

    public void capacity() {
        System.out.println("Bus can carry around 50 passengers.");
    }
}

class Train implements Transport {
    public void move() {
        System.out.println("Train moves on railway tracks.");
    }

    public void capacity() {
        System.out.println("Train can carry hundreds of passengers.");
    }
}

class Airplane implements Transport {
    public void move() {
        System.out.println("Airplane flies in the sky.");
    }

    public void capacity() {
        System.out.println("Airplane can carry around 200-300 passengers.");
    }
}
// Interface
interface Transport {
    void move();
    void capacity();
}
