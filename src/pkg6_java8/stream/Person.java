package pkg6_java8.stream;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name=name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: "+ this.age + ", Gender: "+this.gender ;
    }
}

