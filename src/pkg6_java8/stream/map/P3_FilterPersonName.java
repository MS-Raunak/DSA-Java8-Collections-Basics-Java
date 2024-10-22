package pkg6_java8.stream.map;

import stream.Person;

import java.util.Arrays;
import java.util.List;

public class P3_FilterPersonName {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Ram", 32, "M"),
                new Person("Raman", 25, "M"),
                new Person("Sita", 23, "F"),
                new Person("Gita", 27, "F"));
        System.out.println("Filter stream.Person's Name using Java8 Map method\n===============================================");
        filterName(personList, "Ram");
    }

    private static void filterName(List<Person> personList, String filterStr) {
         String name = personList.stream()
                .filter(person -> person.getName().equals(filterStr))
                .findAny()
                .map(Person::getName)
                .orElse(null);

        System.out.println(name);
    }
}
