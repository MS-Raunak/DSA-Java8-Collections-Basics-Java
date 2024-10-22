package pkg6_java8.functionFunctionalInterface;

import java.util.function.Function;

/**
 * Function is a functional interface which has one abstract method names as apply().
 * apply() accepts one argument and return one value.
 * IT can return any type of value
 * Function accepts two generic first-one indicates the value on which we have to perform operation
 * and second one is return type. E.g: Function<String, Integer>
 * Syntax:
 * interface Function<T,R> {
 *     R apply(T t);
 * }
 *
 */
public class P1_Demo {
    public static void main(String[] args) {
        convertStrToUpper("Chhaya");
        printStrLen("Chhaya");
    }

    //Convert String in uppercase
    private static void convertStrToUpper(String str) {
        Function<String, String> function= s -> s.toUpperCase();
        String resStr = function.apply(str);
        System.out.println("Uppercase: " + resStr);
    }

    //Print String length
    private static void printStrLen(String str) {
        Function<String, Integer> function= s -> s.length();
        int strLen = function.apply(str);
        System.out.println("Length Of Str: " + strLen);
    }
}
