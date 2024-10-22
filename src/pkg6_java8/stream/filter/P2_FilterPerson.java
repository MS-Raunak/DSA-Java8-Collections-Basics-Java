package stream.filter;

import stream.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class P2_FilterPerson {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Ram", 32, "M"),
                                                new Person("Raman", 25, "M"),
                                                new Person("Sita", 23, "F"),
                                                new Person("Gita", 27, "F"));
        System.out.println("Filter stream.Person's Name using Regular Process\n===============================================");
        filterName(personList, "Ram");

        System.out.println("\nFilter stream.Person's Name Java8\n=============================================");
        filterNameJava8(personList, "Ram");

        System.out.println("\nFilter stream.Person's Based On Age Using Java8\n=========================================");
        filterPersonBasedOnGenderJava8(personList, "Ram");

        System.out.println("\nFilter stream.Person's Based On Age Using Java8\n=========================================");
        filterPersonBasedOnGenderJava8(personList, "Ram");
    }

    //Before Java8
    private static void filterName(List<Person> personList, String name) {
        List<Person> filteredPersonList = new ArrayList<>();

        for (Person person : personList) {
            if (person.getName().equals(name)){
                filteredPersonList.add(person);
            }
        }
        System.out.println(filteredPersonList);
    }

    //Java8 Onwards
    public static void filterNameJava8(List<Person> personList, String name){
        Person personObj = personList.stream().filter(person-> person.getName().equals("Ram")).findAny().orElse(null);
        System.out.println(personObj);

    }

    //Java8
    public static void filterPersonBasedOnGenderJava8(List<Person> personList, String name){
        List<Person> personList1 = personList.stream()
                                    .filter(person-> person.getGender().equals("M")) //filter person whose gender is Male
                                    .collect(Collectors.toList()); //Collect filtered person and convert stream to list

        personList1.forEach(person -> System.out.println(person));
    }


}


