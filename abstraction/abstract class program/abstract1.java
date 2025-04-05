public class EmployeeDemo {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 101, 50000);
        Employee partTime = new PartTimeEmployee("Bob", 102, 80, 200);

        System.out.println("== Full-Time Employee ==");
        fullTime.displayDetails();
        System.out.println("Monthly Salary: ₹" + fullTime.calculateSalary());

        System.out.println("\n== Part-Time Employee ==");
        partTime.displayDetails();
        System.out.println("Salary: ₹" + partTime.calculateSalary());
    }
}
// Abstract class
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
