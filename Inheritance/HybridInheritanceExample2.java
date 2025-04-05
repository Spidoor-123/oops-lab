// Main class
public class HybridInheritanceExample2 {
    public static void main(String[] args) {
        Student student = new Student("Vijay", "Computer Science");

        student.displayInfo();    
        student.displayMajor();   
        student.playSport();      
        student.createArt();      
    }
}
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Interface 1
interface Athlete {
    void playSport();
}

// Interface 2
interface Artist {
    void createArt();
}


class Student extends Person implements Athlete, Artist {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public void displayMajor() {
        System.out.println("Major: " + major);
    }

    
    public void playSport() {
        System.out.println(name + " is playing football.");
    }

    
    public void createArt() {
        System.out.println(name + " is painting a landscape.");
    }
}


