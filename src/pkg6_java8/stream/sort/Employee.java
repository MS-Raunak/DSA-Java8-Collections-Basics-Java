package pkg6_java8.stream.sort;

public class Employee {
    String name;
    double salary;
    String gender;

    public Employee(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Salary: " + salary + ", Gender: " + gender + "]";
    }
}
