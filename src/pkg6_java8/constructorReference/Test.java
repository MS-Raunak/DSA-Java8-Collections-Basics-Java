package constructorReference;

import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Joya", "Raju", "Chhaya");

        //Using lambda
       //List<Student> studentList = names.stream().map(name-> new Student(name)).toList();

        //using Constructor reference
       List<Student> studentList = names.stream().map( Student::new).toList();

       studentList.forEach(System.out::println);
    }
}
