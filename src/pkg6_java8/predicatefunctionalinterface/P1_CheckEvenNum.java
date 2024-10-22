package pkg6_java8.predicatefunctionalinterface;

import java.util.function.Predicate;

/**
 * Predicate is an inbuilt functional interface which is having only one abstract method.
 * It contains test method which accepts one arg and return boolean value.
 * Syntax:
 * public interface Predicate<T> {
 *  boolean test(T t);
 * }
 *
 */

//Check Whether the ven number or not
public class P1_CheckEvenNum {
    public static void main(String[] args) {
        Predicate<Integer> predicate = num-> num%2==0;

        if(predicate.test(10)) System.out.println("Even number");
        else System.out.println("Odd number");
    }
}
