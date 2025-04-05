public class singleInherit {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah cheetah = new Cheetah();
        // Call the move method on the Cheetah instance
        cheetah.move();
    }
}

class animal {
    
    public void move() {
        System.out.println("Animal moves");
    }

    public void eat(){
        System.out.println("animal is eating");
    }
} 
 class Cheetah extends Animal {
    @Override 
    public void move() {
        System.out.println("This cheetah is running!");
    }

    public void  eat(){
        System.out.println("Cheetah is eating ");
    }
}
