// Base class (Grandparent)
public class MultilevelInherit1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Canine", "Brown", "Golden Retriever");

        myDog.displayInfo();
        myDog.eat();
        myDog.giveBirth();
        myDog.bark();
    }
}
class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

// Intermediate class (Parent) inheriting from Animal
class Mammal extends Animal {
    protected String furColor;

    public Mammal(String species, String furColor) {
        super(species);
        this.furColor = furColor;
    }

    public void giveBirth() {
        System.out.println("Mammal gives birth to live young.");
    }

    public void displayFurColor() {
        System.out.println("Fur Color: " + furColor);
    }
}

// Derived class (Child) inheriting from Mammal
class Dog extends Mammal {
    private String breed;

    public Dog(String species, String furColor, String breed) {
        super(species, furColor);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog barks woof!");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating a bone.");
    }

    public void displayInfo() {
        displaySpecies();
        displayFurColor();
        displayBreed();
    }
}


