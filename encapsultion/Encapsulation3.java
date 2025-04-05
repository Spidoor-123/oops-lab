public class Encapsulation3 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(1001);
        e.setName("Rahul ");
        e.setSalary(85000);

        e.displayDetails();
    }
}
class Employee {
   
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Setting to 0.");
            this.salary = 0;
        }
    }


    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
