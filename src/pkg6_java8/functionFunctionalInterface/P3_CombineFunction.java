package pkg6_java8.functionFunctionalInterface;

import java.util.function.Function;

public class P3_CombineFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = num -> 2*num;
        Function<Integer, Integer> f2 = num -> num*num*num;

        System.out.println(f1.andThen(f2).apply(2)); //64
        /**
         * f1.andThen(f2) means f2 followed by f1
         * Execution:
         * First f1 will be executed 2*2=>4=>num=4
         * And then f2 will be executed 4*4*4=>64
         */

        System.out.println(f1.compose(f2).apply(2));//16
        /**
         * f1.compose(f2) means f1 followed by f2
         * Execution:
         * First f2 will be executed 2*2*2=>8=>num=8
         * And then f1 will be executed 2*8*=>16
         */
    }
}
