public class Encapsulation2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ragul");
        p.setAge(19);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
  
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
