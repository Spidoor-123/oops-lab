// Base class (Parent) - Employee
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public double calculateBonus() {
        return 0; // Default bonus (to be overridden)
    }
}

// Derived class (Child 1) - Manager, inheriting from Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for managers
    }

    public void displayManagerDetails() {
        displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + calculateBonus());
    }
}

// Derived class (Child 2) - Developer, inheriting from Employee
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus for developers
    }

    public void displayDeveloperDetails() {
        displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Bonus: " + calculateBonus());
    }
}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 80000, "Sales");
        Developer developer = new Developer("Bob", 60000, "Java");

        manager.displayManagerDetails();
        System.out.println("------------------");
        developer.displayDeveloperDetails();
    }
}