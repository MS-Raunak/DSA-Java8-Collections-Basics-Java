package pkg6_java8.predicatefunctionalinterface;

import java.util.function.Predicate;

//Check the given number smaller than 5 or not
public class P2_CheckSmallestNum {
    public static void main(String[] args) {
        Predicate<Integer> predicate = num -> num < 5;
        if(predicate.test(3)) System.out.println("3 is Smallest Number than 5");
        else System.out.println("3 is Largest number than 5");
    }
}
