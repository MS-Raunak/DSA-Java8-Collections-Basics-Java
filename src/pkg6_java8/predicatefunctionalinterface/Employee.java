package pkg6_java8.predicatefunctionalinterface;

public class Employee {
    String name;
    double salary;
    String gender;

    public  Employee(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Salary: " + salary + ", Gender: " + gender + "]";
    }
}
