package pkg6_java8.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a program to filter names from given list whose name start with given name
 */
public class P1_Demo {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Ram", "Shayam", "Raman", "Sita", "Gita");
        filterName(namesList, "R");
        filterNameUsingJava8(namesList, "R");
    }

    //Before Java8
    private static void filterName(List<String> namesList, String filterStr) {
        List<String> filteredName = new ArrayList<>();
        for (String name : namesList) {
            if (name.startsWith(filterStr)){
                filteredName.add(name);
            }
        }
        System.out.println(filteredName);
    }

    //Java8 Onwards
    private static void filterNameUsingJava8(List<String> namesList, String filterStr) {
        List<String> filteredNameList = new ArrayList<>();

        //converts list to stream
        Stream<String> stream = namesList.stream();
        //filter the name start with 'P'
        stream = stream.filter(name -> name.startsWith("R"));

        //Collect the output using collect() and convert stream to a list using toList() of Collectors class
        filteredNameList = stream.collect(Collectors.toList());

        filteredNameList.forEach(System.out::println);

        //In single line
        //filteredNameList = namesList.stream().filter(name-> name.startsWith("R")).collect(Collectors.toList());
        //filteredNameList.forEach(System.out::println);
    }
}
