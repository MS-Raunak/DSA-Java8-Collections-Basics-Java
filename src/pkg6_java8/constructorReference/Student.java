package pkg6_java8.constructorReference;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student[name=" + name + "]";

    }
}
