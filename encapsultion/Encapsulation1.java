public class Encapsulation1 {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Raagav");
        student.setAge(18);
        student.setRollNumber(28);

        // Accessing values using getters
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
// Class demonstrating encapsulation
class Student {
    // Private fields (data hiding)
    private String name;
    private int age;
    private int rollNumber;

    // Public setter methods to set values
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Public getter methods to access values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
