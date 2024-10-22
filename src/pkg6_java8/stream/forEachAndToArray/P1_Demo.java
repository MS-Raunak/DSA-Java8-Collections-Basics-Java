package stream.forEachAndToArray;

import java.util.Arrays;
import java.util.List;

public class P1_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.forEach(System.out::println);
        System.out.println("===============");

        Object[]arr =  nums.stream().toArray();
        Arrays.stream(arr).forEach(System.out::println);
    }
}
