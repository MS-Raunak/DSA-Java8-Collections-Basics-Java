package pkg6_java8.stream.count;


import stream.Person;

import java.util.Arrays;
import java.util.List;

//Count total male person
public class P2_CountPerson {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ram", 23, "M"),
                new Person("Shyam", 33, "M"),
                new Person("Bramha", 43, "M"),
                new Person("Parvati", 53, "F")
        );

        long totalMalePerson = personList.stream().filter(person -> person.getGender().equals("M")).count();
        System.out.println("Total Male Person: " + totalMalePerson);
    }
}
