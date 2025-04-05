public class Constructor_b {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayPerson();
        emp.displayEmployee();
    }
}
class Person {
    public Person() {
        System.out.println("Person constructor called");
    }

    public void displayPerson() {
        System.out.println("This is a person");
    }
}

class Employee extends Person {
    public Employee() {
        super(); // Calls Person constructor
        System.out.println("Employee constructor called");
    }

    public void displayEmployee() {
        System.out.println("This is an employee");
    }
}


