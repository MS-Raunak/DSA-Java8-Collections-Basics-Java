package pkg6_java8.SupplierFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

/**
 * IT is a functional interface which doesn't take any input but produce eor return a value.
 * It has only one method get().
 * Syntax:
 * interface Supplier<T> {
 *     R get();
 * }
 */
public class P1_Demo {
    public static void main(String[] args) {
        //Example-1
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        //Example-2
        Supplier<Date> supplier1 = () -> new Date();
        System.out.println(supplier1.get());
    }
}
