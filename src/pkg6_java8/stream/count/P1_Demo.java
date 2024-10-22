package pkg6_java8.stream.count;

import java.util.Arrays;
import java.util.List;

public class P1_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);

        long totalNums = nums.stream().count();
        System.out.println(totalNums);
    }
}
