package pkg6_java8.predicatefunctionalinterface;

import java.util.function.Predicate;

//print the name whose name length is greater than 5
public class P3_CheckLengthOfStr {
    public static void main(String[] args) {
        String[]nameList = {"Chhaya", "David", "Ram", "Mohan", "Chandrashekhar"};

        //printName(nameList);
        printNameUsingJava8(nameList);
    }

    //Without using Java 8
    private static void printName(String[] nameList) {
        for (String name : nameList) {
            if (name.length() > 5){
                System.out.println(name);
            }
        }
    }

    //Using Java8
    private static void printNameUsingJava8(String[] nameList) {
        Predicate<String> predicate = name -> name.length() > 5;

        for (String name : nameList) {
            if (predicate.test(name))
                System.out.println(name);
        }
    }
}
