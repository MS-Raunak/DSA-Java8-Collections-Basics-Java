package pkg6_java8.consumerFunctionalInterface;

import java.util.function.Consumer;

/**
 * Consumer is a functional interface which has one abstract method accept().
 * accept() accepts(consume) one arg(value) and doesn't return anything
 * Mainly it is used to print value or store the data in database.
 *
 * Syntax:
 * interface Consumer<T> {
 *     void consume(T t);
 * }
 *
 */

//Print given data
public class P1_Demo {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Chhaya");
    }
}
